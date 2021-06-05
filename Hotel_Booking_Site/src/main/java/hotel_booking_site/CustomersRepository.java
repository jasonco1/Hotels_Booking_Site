package hotel_booking_site;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

public interface CustomersRepository extends JpaRepository<Customer, Long> {
	
	@Query
	Customer authenticateCustomer(String username, String password);
	
	@Query(value="SELECT c.id, c.first_name, c.last_name, c.email, c.password, c.current_balance FROM customers c WHERE c.email = ?1 LIMIT 1", nativeQuery=true)
	Customer findCustomerIdByUsername(String username);
}
