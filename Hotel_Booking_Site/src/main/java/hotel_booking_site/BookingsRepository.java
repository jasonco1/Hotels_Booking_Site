package hotel_booking_site;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface BookingsRepository extends JpaRepository<Booking, Long> {
	
	@Query(value="SELECT b.id, b.room_id, b.customer_id, b.total_price, b.check_in_date, b.check_out_date, b.number_occupants FROM bookings b WHERE b.customer_id = ?1", nativeQuery=true)  
	List<Booking> findBookingsByCustomerId(int customer_id); 

}
