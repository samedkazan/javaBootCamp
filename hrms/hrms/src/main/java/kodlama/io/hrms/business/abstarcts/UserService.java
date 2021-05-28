package kodlama.io.hrms.business.abstarcts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entites.concretes.User;

public interface UserService {
	Result add(User user);
//	Result update(User user);
//	Result delete(int id);
//	DataResult<User> getById(int id);
	
	DataResult<List<User>> getAll();
	DataResult<User> getUserByEmail(String email);
}
