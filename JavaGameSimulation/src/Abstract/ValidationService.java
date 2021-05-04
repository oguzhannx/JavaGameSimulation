package Abstract;

import Entities.Customer;

public interface ValidationService {
	boolean isRealPerson(Customer customer);
}
