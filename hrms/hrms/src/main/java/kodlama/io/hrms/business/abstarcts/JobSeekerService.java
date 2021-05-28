package kodlama.io.hrms.business.abstarcts;

import java.util.List;



import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entites.concretes.JobSeeker;


public interface JobSeekerService {
	Result add(JobSeeker jobSeeker);
//	Result update(Jobseeker jobseeker);
//	Result delete(int id);
//	DataResult<Jobseeker> getById(int id);
	
	DataResult<List<JobSeeker>> getAll();
	DataResult<JobSeeker> getJobseekerByNationalId(String nationalId);
}