package kodlamaio.HrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HrmsDemo.business.abstacts.EmployerService;
import kodlamaio.HrmsDemo.business.abstacts.UserService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.ErrorResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessResult;
import kodlamaio.HrmsDemo.dataAccess.abstarcts.EmployerDao;
import kodlamaio.HrmsDemo.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	private UserService userService;
	
	
    @Autowired
	public EmployerManager(EmployerDao employerDao,UserService userService) {
		super();
		this.employerDao = employerDao;
		this.userService=userService;
		
	}

	@Override
	public Result add(Employer employer) {
		
	if(this.userService.checkEmail(employer.getEmail()).getData() !=null) {
			
			return new ErrorResult("Email exist");
		}
		
		this.employerDao.save(employer);
		return new SuccessResult("Employer Added!");
	}

//	@Override
//	public Result update(Employer employer) {
//		this.employerDao.save(employer);
//		return new SuccessResult("Employer Updated!");
//	}
//
//	@Override
//	public Result delete(Employer employer) {
//		this.employerDao.delete(employer);
//		return new SuccessResult("Employer Deleted!");
//	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Employer Listed");
	}

	

//	@Override
//	public DataResult<Employer> get(int id) {
//		
//		return new SuccessDataResult<Employer>( this.employerDao.findById(id).get());
//	}


}
