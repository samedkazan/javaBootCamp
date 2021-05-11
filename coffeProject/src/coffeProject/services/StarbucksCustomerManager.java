package coffeProject.services;

import coffeProject.abstratcs.CustomerManager;
import coffeProject.entities.Customer;
import coffeProject.interfaces.CustomerCheckService;
import coffeProject.interfaces.Result;
import coffeProject.utils.CheckServiceUtils;

public class StarbucksCustomerManager  extends CustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {

		Result result = CheckServiceUtils.runCheckServices(new Result[]
				{ customerCheckService.CheckIfRealPerson(customer),
			customerCheckService.CheckIfYoungerAgeThan(customer, 15) });
				

		if (!result.isSuccess()) {
			System.out.println(result.getMessage());
			return;
		}

		super.add(customer);
	}
}
