package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstarcts.JobPositionService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.ErrorResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAcces.abstracts.JobPositionDao;
import kodlama.io.hrms.entites.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public Result add(JobPosition jobPosition) {
		if(getJobByTitle(jobPosition.getJobTitle()).getData() != null){
			return new ErrorResult( jobPosition.getJobTitle() + "Girdiğiniz iş zaten mevcut");
		}
		this.jobPositionDao.save(jobPosition);
	    return new SuccessResult("İş pozisyonu eklendi.");
	}
//
//	@Override
//	public Result update(JobPosition jobPosition) {
//		this.jobPositionDao.save(jobPosition);
//      return new SuccessResult("İş pozisyonu güncellendi.");
//	}
//
//	@Override
//	public Result delete(int id) {
//		this.jobPositionDao.deleteById(id);
//      return new SuccessResult("İş pozisyonu silindi.");
//	}
//
//	@Override
//	public DataResult<JobPosition> getById(int id) {
//		return new SuccessDataResult<JobPosition>(this.jobPositionDao.getOne(id));
//	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll());
	}

	@Override
	public DataResult<JobPosition> getJobByTitle(String title) {
		
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.findByJobTitle(title));
	}

}