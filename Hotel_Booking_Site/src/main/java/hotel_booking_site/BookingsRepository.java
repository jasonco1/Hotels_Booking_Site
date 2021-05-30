package hotel_booking_site;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookingsRepository extends JpaRepository<Booking, Long> {
	
	//<List>Booking findById(Long id);

}
