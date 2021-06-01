package hotel_booking_site;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CustomersRepository extends JpaRepository<Customer, Long> {

}
