package coffeProject.abstratcs;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import coffeProject.entities.Customer;
import coffeProject.interfaces.CustomerCheckService;
import coffeProject.interfaces.Result;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public Result CheckIfRealPerson(Customer customer) {

		return new coffeProject.utils.Result(true);
	}

	@Override
	public final Result CheckIfYoungerAgeThan(Customer customer, int age) {
		LocalDate todayDateTime = LocalDate.now();
		LocalDate birthDate = customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int yearDifference = Period.between(birthDate, todayDateTime).getYears();
		if (yearDifference < age) {
			return new coffeProject.utils.Result(false, age + " yaþýndan küçük olamaz.");
		}
		return new coffeProject.utils.Result(true);
	}
}
