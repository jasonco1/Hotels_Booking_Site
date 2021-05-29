package hotel_booking_site;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvailableRoomsService {
	
	@Autowired
	private RoomsRepository roomsRepository;
	
	@Autowired
	private HotelsRepository hotelsRepository;
	
	//retrieve a list of RoomInfo objects with room and hotel information
	//that represent the available rooms according to the user's search parameters
	
	public RoomInfo getRoomInfo(String cityName) {
		
		List<Room> rooms = roomsRepository.findByCityName(cityName);
		if (rooms.size() < 1) {
			return null;
		}
		
		else {
		Room room = rooms.get(0);
		
		Hotel hotel = hotelsRepository.findById(room.getHotel_id());
		
		//build RoomInfo object
		RoomInfo roomInfo = new RoomInfo(room, hotel);
		
		return roomInfo;
		}
		
	}
	
}
