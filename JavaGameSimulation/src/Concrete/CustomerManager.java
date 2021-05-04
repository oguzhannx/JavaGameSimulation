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
			System.out.println("M��teri Bilgileri Hatal� Girilmi� ");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		if (validationService.isRealPerson(customer)) {
			System.out.println("Silindi : " + customer.getFirstName());	
		}else {
			System.out.println("M��teri Bilgileri Hatal� Girilmi� ");
		}
	}

	@Override
	public void update(Customer customer) {
		if (validationService.isRealPerson(customer)) {
			System.out.println("G�ncellendi : " + customer.getFirstName());	
		}else {
			System.out.println("M��teri Bilgileri Hatal� Girilmi� ");
		}
	}

}
