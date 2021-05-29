package kodlamaio.HrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HrmsDemo.business.abstacts.JobService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.ErrorResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessResult;
import kodlamaio.HrmsDemo.dataAccess.abstarcts.JobDao;
import kodlamaio.HrmsDemo.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public Result add(Job job) {
		
		if(this.jobPositionExist(job.getName()).getData() != null) {
			
			return new ErrorResult( "Job Title exist");
		}
		
		this.jobDao.save(job);
		return new SuccessResult("Job Titles Added!");
	}
	
	private DataResult<Job> jobPositionExist(String jobName) {
		
		return new SuccessDataResult<Job>(this.jobDao.findByName(jobName));
		
	}

//	@Override
//	public Result update(Job job) {
//		this.jobDao.save(job);
//		return new SuccessResult();
//	}

//	@Override
//	public Result delete(Job job) {
//		this.jobDao.delete(job);
//		return new SuccessResult();
//	}

	@Override
	public DataResult<List<Job>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Job>>( this.jobDao.findAll(),"Job titles listed");
	}

//	@Override
//	public Job get(int id) {
//		// TODO Auto-generated method stub
//		return this.jobDao.findById(id).get();
//	}

}