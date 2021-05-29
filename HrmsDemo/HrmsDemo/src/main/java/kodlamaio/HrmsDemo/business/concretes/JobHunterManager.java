package kodlamaio.HrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HrmsDemo.business.abstacts.JobHunterService;
import kodlamaio.HrmsDemo.business.abstacts.UserService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.ErrorResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessResult;
import kodlamaio.HrmsDemo.dataAccess.abstarcts.JobHunterDao;
import kodlamaio.HrmsDemo.entities.concretes.JobHunter;

@Service
public class JobHunterManager implements JobHunterService {

	private JobHunterDao jobHunterDao;
	private UserService userService;

	@Autowired
	public JobHunterManager(JobHunterDao jobHunterDao, UserService userService) {
		super();
		this.jobHunterDao = jobHunterDao;
		this.userService = userService;
	}

	@Override
	public Result add(JobHunter jobHunt) {

		if ((this.userService.checkEmail(jobHunt.getEmail()).getData() != null)
				&& (this.checkTcExist(jobHunt.getNationalIdentity()).getData() != null)) {

			return new ErrorResult("Mail or TcNo exist");
		}

		this.jobHunterDao.save(jobHunt);
		return new SuccessResult("Condidate Added");

	}

	@Override
	public Result update(JobHunter jobHunt) {
		this.jobHunterDao.save(jobHunt);
		return new SuccessResult("Condidate Updated");
	}

	@Override
	public Result delete(JobHunter jobHunt) {
		this.jobHunterDao.delete(jobHunt);
		return new SuccessResult("Condidate Deleted");
	}

	@Override
	public DataResult<List<JobHunter>> getAll() {

		return new SuccessDataResult<List<JobHunter>>(this.jobHunterDao.findAll(), "Condidates Listed");
	}

	@Override
	public DataResult<JobHunter> get(int id) {

		return new SuccessDataResult<JobHunter>(this.jobHunterDao.findById(id).get());
	}

	private DataResult<JobHunter> checkTcExist(String tcNo) {

		return new SuccessDataResult<JobHunter>(this.jobHunterDao.findBynationalIdentity(tcNo));

	}

}
