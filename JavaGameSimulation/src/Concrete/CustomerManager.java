package Concrete;

import Abstract.CustomerService;
import Abstract.ValidationService;
import Entities.Customer;

public class CustomerManager implements CustomerService{

	private ValidationService validationService;
	
	
	
	public CustomerManager(ValidationService validationService) {
		this.validationService = validationService;
	}

	@Override
	public void add(Customer customer) {
		if (validationService.isRealPerson(customer)) {
			System.out.println("Eklendi : " + customer.getFirstName());	
		}else {
			System.out.println("Müþteri Bilgileri Hatalý Girilmiþ ");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		if (validationService.isRealPerson(customer)) {
			System.out.println("Silindi : " + customer.getFirstName());	
		}else {
			System.out.println("Müþteri Bilgileri Hatalý Girilmiþ ");
		}
	}

	@Override
	public void update(Customer customer) {
		if (validationService.isRealPerson(customer)) {
			System.out.println("Güncellendi : " + customer.getFirstName());	
		}else {
			System.out.println("Müþteri Bilgileri Hatalý Girilmiþ ");
		}
	}

}
