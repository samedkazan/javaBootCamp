package coffeProject;

import java.util.GregorianCalendar;

import coffeProject.adapters.MernisServiceAdapter;
import coffeProject.entities.Customer;
import coffeProject.interfaces.CustomerCheckService;
import coffeProject.interfaces.CustomerService;
import coffeProject.services.StarbucksCustomerCheckManager;
import coffeProject.services.StarbucksCustomerManager;

public class Main {
	public static void main(String[] args) {

		Customer enginCustomer = new Customer();
		enginCustomer.setId(1);
		enginCustomer.setIdentityNumber("000000000000");
		enginCustomer.setFirstName("SOYAD");
		enginCustomer.setLastName("AD");
		enginCustomer.setBirthDate(new GregorianCalendar(0000, 00, 00).getTime());

		CustomerCheckService customerCheckService = new StarbucksCustomerCheckManager(new MernisServiceAdapter());

		CustomerService customerService = new StarbucksCustomerManager(customerCheckService);
		customerService.add(enginCustomer);
	}
}
