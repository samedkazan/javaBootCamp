package coffeProject.interfaces;

import coffeProject.entities.Customer;

public interface CustomerCheckService {
	Result CheckIfRealPerson(Customer customer);
	Result CheckIfYoungerAgeThan(Customer customer, int age);
}
