package hotel_booking_site;


import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvailableRoomsService {
	
	@Autowired
	private RoomsRepository roomsRepository;
	
	@Autowired
	private HotelsRepository hotelsRepository;
	
	//retrieve a list of RoomInfo objects with room and hotel information
	//representing the available rooms according to the user's search parameters
	public List<RoomInfo> getRoomInfo(String cityName) {
		
		List<RoomInfo> roomInfoList = new ArrayList<>();
		List<Room> rooms = roomsRepository.findByCityName(cityName);
		
		if (rooms.size() < 1) {
			return null;
		}
		
		else {
			for (Room room : rooms) {
				
				//build RoomInfo object
				Hotel hotel = hotelsRepository.findById(room.getHotel_id());
				RoomInfo roomInfo = new RoomInfo(room, hotel);
				roomInfoList.add(roomInfo);
				
				System.out.println(roomInfo.hotel.getName());
				}
		}
		
		return roomInfoList;
	}
}
