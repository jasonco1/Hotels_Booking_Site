package hotel_booking_site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelBookingController {
	
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
		
		model.addAttribute("city", city);
		model.addAttribute("checkInDate", checkInDate);
		model.addAttribute("checkOutDate", checkOutDate);
		
		return "hotel_results_page";
	}
}
