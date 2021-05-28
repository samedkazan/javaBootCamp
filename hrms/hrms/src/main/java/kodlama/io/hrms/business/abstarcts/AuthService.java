package kodlama.io.hrms.business.abstarcts;



import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entites.concretes.Employer;
import kodlama.io.hrms.entites.concretes.JobSeeker;

public interface AuthService {
	
	Result registerEmployer(Employer employer, String confirmPassword);
	Result registerJobseeker(JobSeeker jobSeeker, String confirmPassword);

}
