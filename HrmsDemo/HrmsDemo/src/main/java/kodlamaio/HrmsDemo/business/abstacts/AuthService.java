package kodlamaio.HrmsDemo.business.abstacts;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.Employer;
import kodlamaio.HrmsDemo.entities.concretes.JobHunter;

public interface AuthService {
	DataResult<JobHunter> registerJobHunter(JobHunter jobHunter,String confirmPassword);
	DataResult<Employer> registerEmployer(Employer employer,String confirmPassword);
}
