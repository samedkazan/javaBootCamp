package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
	User add(User user);
}
