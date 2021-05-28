package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstarcts.UserService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAcces.abstracts.UserDao;
import kodlama.io.hrms.entites.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
	    return new SuccessResult("Kullanıcı eklendi.");
	}
//
//	@Override
//	public Result update(User user) {
//		this.userDao.save(user);
//      return new SuccessResult("Kullanıcı güncellendi.");
//	}
//
//	@Override
//	public Result delete(int id) {
//		this.userDao.deleteById(id);
//      return new SuccessResult("Kullanıcı silindi.");
//	}
//
//	@Override
//	public DataResult<User> getById(int id) {
//		return new SuccessDataResult<User>(this.userDao.getOne(id));
//	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}

	@Override
	public DataResult<User> getUserByEmail(String email) {

		return new SuccessDataResult<User>(this.userDao.findUserByEmail(email));
	}

}
