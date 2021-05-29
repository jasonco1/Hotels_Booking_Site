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
	AvailableRoomsService availableRoomsService;
	
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
		RoomInfo roomInfo = availableRoomsService.getRoomInfo(city);
		
		if (roomInfo == null) {
			String no_rooms_found = "Sorry, no available rooms where found. Please try "
					+ "a different date or city.";
			model.addAttribute("no_rooms_found", no_rooms_found);
			
			return "no_results_page";
			
		}
		
		else {
		model.addAttribute(roomInfo);
		return "hotel_results_page";
		
		}
	}
	
	
	
	//Navigation Bar Routes
	@GetMapping("/hotels/login")
	public String getHotelsLoginPage(Model model) {
		return "hotels_login_page";
	}
	
	@GetMapping("/hotels/signup")
	public String getHotelsSignUpPage(Model model) {
		return "hotels_signup_page";
	}
	
	@GetMapping("/airline")
	public String getAirlineHomepage(Model model) {
		return "airline";
	}
	
	@GetMapping("/carrentals")
	public String getCarRentalsHomepage(Model model) {
		return "car_rentals";
	}
	
	@GetMapping("/deals")
	public String getDealseHomepage(Model model) {
		return "deals";
	}
		
}
