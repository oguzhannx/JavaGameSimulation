package Concrete;

import Abstract.ValidationService;
import Entities.Customer;

public class ValidationManager implements ValidationService{

	@Override
	public boolean isRealPerson(Customer customer) {
		//Gerekli mernis kodlar� 
		//test ama�l� true de�er d�nd�r�ld�
		
//		if (customer.getNationalityId().length() == 11) {
//			return true;
//		}else {
//			return false;
//		}

		return true;
	}

	

}
