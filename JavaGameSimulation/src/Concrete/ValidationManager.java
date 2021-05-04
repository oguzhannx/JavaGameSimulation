package Concrete;

import Abstract.ValidationService;
import Entities.Customer;

public class ValidationManager implements ValidationService{

	@Override
	public boolean isRealPerson(Customer customer) {
		//Gerekli mernis kodlarý 
		//test amaçlý true deðer döndürüldü
		
//		if (customer.getNationalityId().length() == 11) {
//			return true;
//		}else {
//			return false;
//		}

		return true;
	}

	

}
