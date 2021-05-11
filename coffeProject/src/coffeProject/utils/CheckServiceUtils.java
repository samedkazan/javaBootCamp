package coffeProject.utils;
import coffeProject.interfaces.Result;
public class CheckServiceUtils {
	public static Result runCheckServices(Result[] customerCheckServices) {
		for (Result customerCheckService : customerCheckServices) {
			if(!customerCheckService.isSuccess()) {
				return customerCheckService;
			}
		}
		return new coffeProject.utils.Result(true);
	}
}
