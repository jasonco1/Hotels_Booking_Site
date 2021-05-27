package hotel_booking_site;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface HotelsRepository extends CrudRepository<Room, Long> {
	
	@Query("SELECT r FROM Room r ORDER BY room_id")
	List<Room> findAllRoomsMatchingSearchCriteria();	
	
}
