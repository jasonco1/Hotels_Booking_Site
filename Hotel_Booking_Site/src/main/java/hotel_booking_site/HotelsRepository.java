package hotel_booking_site;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface HotelsRepository extends JpaRepository<Room, Long> {
	
	//methods
	//List<Room> findAllRoomsMatchingSearchCriteria();	
	List<Room> findById(int id);
	
}
