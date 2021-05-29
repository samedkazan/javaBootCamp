package kodlamaio.HrmsDemo.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HrmsDemo.business.abstacts.AuthService;
import kodlamaio.HrmsDemo.business.abstacts.EmployerService;
import kodlamaio.HrmsDemo.business.abstacts.JobHunterService;
import kodlamaio.HrmsDemo.business.abstacts.VerifyCodeService;
import kodlamaio.HrmsDemo.core.utilities.adapters.MernisService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.ErrorDataResult;
import kodlamaio.HrmsDemo.core.utilities.results.ErrorResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessResult;
import kodlamaio.HrmsDemo.core.utilities.verification.VerificationService;
import kodlamaio.HrmsDemo.entities.concretes.Employer;
import kodlamaio.HrmsDemo.entities.concretes.JobHunter;

@Service
public class AuthManager implements AuthService {
	
	private JobHunterService jobHunterService;
	private EmployerService employerService;
	private MernisService mernisService;
	private VerificationService veri;
	private VerifyCodeService veriCode;
	
	
    @Autowired
	public AuthManager(JobHunterService jobHunterService,VerifyCodeService veriCode,EmployerService employerService,MernisService mernisService,VerificationService veri) {
		super();
		this.jobHunterService = jobHunterService;
		this.employerService=employerService;
		this.mernisService=mernisService;
		this.veri=veri;
		this.veriCode=veriCode;
	}

	@Override
	public DataResult<JobHunter> registerJobHunter(JobHunter jobHunter, String confirmPassword) {
		
		if(!this.mernisControl(jobHunter)) {
			return new ErrorDataResult<JobHunter>("Not Real Person!");
		}
		
		if(this.confirmPass(jobHunter.getPassword(), confirmPassword).isSuccess() )
		{
			
			
			var register=this.jobHunterService.add(jobHunter);
			this.veriCode.add(jobHunter.getUserId());
			this.veri.verifyByCode(this.veriCode.generateCode(),jobHunter.getEmail());
			return new SuccessDataResult<JobHunter>(register.getMessage());
		}
		return new ErrorDataResult<JobHunter>("register failed");
		
		
	}

	@Override
	public DataResult<Employer> registerEmployer(Employer employer, String confirmPassword) {
		
		if(this.confirmPass(employer.getPassword(), confirmPassword).isSuccess()) {
			if(this.checkEmailDomain(employer.getEmail(), employer.getWebsite()).isSuccess()) {
				
			   this.employerService.add(employer);
			   this.veri.verifyByEmployee(employer.getUserId());
			   return new SuccessDataResult<Employer>(employer,"Register Success");
			}
			return new ErrorDataResult<Employer>(employer,"Domain not match");
			
		}
		return new ErrorDataResult<Employer>("register failed");
	}
	
	
	private Result confirmPass(String password,String confirmPassword) 
	{	
		
		if (password.equals(confirmPassword)) {
			
			return new SuccessResult("Password Match!");
		}
		return new ErrorResult("Password not match!");
	
	}
	
	private Result checkEmailDomain(String email,String website) {
		
		String[] mail=email.split("@",2);
		String web=website.substring(4);
		if(mail[1].equals(web)) {
			return new SuccessResult("Domain Match");
		}
		return new ErrorResult("Domain not match");
	}
	
	private boolean mernisControl(JobHunter jobHunt) {
		
	var	result = this.mernisService.validatePerson(jobHunt.getNationalIdentity(), jobHunt.getFirstName(), jobHunt.getLastName(), jobHunt.getBirthDate());
		
	     return result;
	}
 
 
	

	
	
	

}
