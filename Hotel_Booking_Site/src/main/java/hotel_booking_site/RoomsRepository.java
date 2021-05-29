package hotel_booking_site;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RoomsRepository extends JpaRepository<Room, String> {
	
	List<Room> findByCityName(String cityName); 
	
}
