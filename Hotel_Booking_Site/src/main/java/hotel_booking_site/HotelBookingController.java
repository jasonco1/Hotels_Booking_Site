package hotel_booking_site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelBookingController {
	
	@Autowired 
	HotelsRepository hotelsRepository;
	
	@GetMapping("/hotels/home")
	public String getHotelsHomepage(Model model) {
		return "hotels_homepage";
	}
	
	@PostMapping("/hotels/results")
	public String getHotelSearchResults(Model model,
			@RequestParam("city") String city,
			@RequestParam("checkInDate") String checkInDate,
			@RequestParam("checkOutDate") String checkOutDate,
			@RequestParam("rooms") String rooms
			) {
		
		model.addAttribute(city);
		model.addAttribute(checkInDate);
		model.addAttribute(checkOutDate);
		
		//Query database to find available rooms
		Iterable<Room> rooms_list = hotelsRepository.findAllRoomsMatchingSearchCriteria();
		model.addAttribute("rooms_list", rooms_list);
		
		return "hotel_results_page";
	}
}
