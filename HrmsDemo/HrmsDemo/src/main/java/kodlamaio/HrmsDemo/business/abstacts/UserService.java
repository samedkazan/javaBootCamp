package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.entities.concretes.User;

public interface UserService {
	Result add(User user);

//	Result update(User user);
//	Result delete(User user);
//	DataResult<User> get(int id);
	DataResult<List<User>> getAll();
	DataResult<User> checkEmail(String email);
}
