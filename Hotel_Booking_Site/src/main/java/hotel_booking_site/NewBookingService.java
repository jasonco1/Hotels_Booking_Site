package hotel_booking_site;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewBookingService {
	
	@Autowired 
	BookingsRepository bookingsRepository;

	@Autowired 
	HotelsRepository hotelsRepository;
	
	@Autowired
	RoomsRepository roomsRepository;
	
	public boolean persistNewBooking(Booking booking) {
		bookingsRepository.save(booking);
		
		return true;
	}
	
	public List<BookingInfo> getListOfBookingsByCustomerId(int customer_id) {
		
		List<BookingInfo> bookingInfoList = new ArrayList<>();
		List<Booking> bookings = bookingsRepository.findBookingsByCustomerId(customer_id);
		
		for (Booking booking : bookings) {
			
			Room room = roomsRepository.findbyRoomId(booking.getRoom_id());
			Hotel hotel = hotelsRepository.findById(room.getHotel_id());
			BookingInfo bookingInfo = new BookingInfo(booking, room, hotel);
			bookingInfoList.add(bookingInfo);
		
		}
		return bookingInfoList;
	}
	
	public boolean cancelHotelBooking(int id) {
		bookingsRepository.deleteByBookingId(id);
		return true;
	}
	
}
