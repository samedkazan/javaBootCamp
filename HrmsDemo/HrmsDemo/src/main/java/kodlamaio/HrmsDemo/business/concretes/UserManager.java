package kodlamaio.HrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HrmsDemo.business.abstacts.UserService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.dataAccess.abstarcts.UserDao;
import kodlamaio.HrmsDemo.entities.concretes.User;

@Service
public class UserManager implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	public UserManager() {
		
	}

	@Override
	public DataResult<List<User>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<User>>(userDao.findAll(),"Başarılı Şekilde Kullanıcılar Listelendi");
	}

	@Override
	public User add(User user) {
		return userDao.save(user);
	}

}
