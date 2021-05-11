package coffeProject.services;

import coffeProject.abstratcs.CustomerCheckManager;
import coffeProject.entities.Customer;
import coffeProject.interfaces.RealPersonService;
import coffeProject.interfaces.Result;

public class StarbucksCustomerCheckManager extends CustomerCheckManager {

	private RealPersonService realPersonService;

	public StarbucksCustomerCheckManager(RealPersonService realPersonService) {
		this.realPersonService = realPersonService;
	}

	@Override
	public Result CheckIfRealPerson(Customer customer) {

		return realPersonService.CheckIfRealPerson(customer);
	}
}
