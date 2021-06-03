package hotel_booking_site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDataService {
	
	@Autowired 
	CustomersRepository customersRepository;
	
	public boolean persistNewCustomer(Customer customer) {
		customersRepository.save(customer);
		
		return true;
	}
}

