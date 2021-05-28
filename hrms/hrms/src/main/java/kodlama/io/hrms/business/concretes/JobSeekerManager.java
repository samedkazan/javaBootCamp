package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstarcts.JobSeekerService;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAcces.abstracts.JobSeekerDao;


import kodlama.io.hrms.entites.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	
	  @Override 
	  public Result add(JobSeeker jobSeeker) {
	  this.jobSeekerDao.save(jobSeeker); return new
	  SuccessResult("İş arayan eklendi."); }
	 
//
//	@Override
//	public Result update(Jobseeker jobseeker) {
//		this.jobseekerDao.save(jobseeker);
//      return new SuccessResult("İş arayan güncellendi.");
//	}
//
//	@Override
//	public Result delete(int id) {
//		this.jobseekerDao.deleteById(id);
//      return new SuccessResult("İş arayan silindi.");
//	}
//
//	@Override
//	public DataResult<Jobseeker> getById(int id) {
//		return new SuccessDataResult<Jobseeker>(this.jobseekerDao.getOne(id));
//	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll());
	}

	@Override
	public DataResult<JobSeeker> getJobseekerByNationalId(String nationalId) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findJobseekerByNationalId(nationalId));
	}

	

}