package kodlamaio.HrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import kodlamaio.HrmsDemo.business.abstacts.UserService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessResult;
import kodlamaio.HrmsDemo.dataAccess.abstarcts.UserDao;
import kodlamaio.HrmsDemo.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<User> checkEmail(String email) {

		return new SuccessDataResult<User>(this.userDao.findByEmail(email));
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
	    return new SuccessResult("Kullanıcı eklendi.");
	}
	@Override
	public DataResult<List<User>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<User>> (this.userDao.findAll());
	}

//	@Override
//	public Result add(User user) {
//		this.userDao.save(user);
//		return new SuccessResult();
//	}
//
//	@Override
//	public Result update(User user) {
//		this.userDao.save(user);
//		return new SuccessResult();
//	}
//
//	@Override
//	public Result delete(User user) {
//		this.userDao.delete(user);
//		return new SuccessResult();
//	}
//
//
//	@Override
//	public DataResult<User> get(int id) {
//		// TODO Auto-generated method stub
//		return new SuccessDataResult<User> (this.userDao.findById(id).get());
//	}

}
