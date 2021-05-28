package kodlama.io.hrms.business.concretes;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstarcts.AuthService;
import kodlama.io.hrms.business.abstarcts.EmployerService;
import kodlama.io.hrms.business.abstarcts.JobSeekerService;
import kodlama.io.hrms.business.abstarcts.UserService;
import kodlama.io.hrms.business.abstarcts.VerificationCodeService;
import kodlama.io.hrms.core.utilities.adapters.ValidationService;
import kodlama.io.hrms.core.utilities.results.ErrorResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.core.verification.VerificationService;
import kodlama.io.hrms.entites.concretes.Employer;
import kodlama.io.hrms.entites.concretes.JobSeeker;
import kodlama.io.hrms.entites.concretes.VerificationCode;

@Service
public class AuthManager implements AuthService {

	private UserService userService;
	private EmployerService employerService;
	private JobSeekerService jobSeekerService;
	private VerificationService verificationService;
	private ValidationService validationService;
	private VerificationCodeService verificationCodeService;

	
	@Autowired
	public AuthManager(UserService userService, EmployerService employerService, JobSeekerService jobSeekerService,
			VerificationService verificationService, ValidationService validationService,
			VerificationCodeService verificationCodeService) {
		super();
		this.userService = userService;
		this.employerService = employerService;
		this.jobSeekerService = jobSeekerService;
		this.verificationService = verificationService;
		this.validationService = validationService;
		this.verificationCodeService = verificationCodeService;
	}

	@Override
	public Result registerEmployer(Employer employer, String confirmPassword) {

		if (!checkIfNullInfoForEmployer(employer)) {

			return new ErrorResult("Eksik bilgi girdiniz. Lütfen bütün boşlukları doldurun.");
		}

		if (!checkIfEqualEmailAndDomain(employer.getEmail(), employer.getWebsite())) {

			return new ErrorResult("Geçersiz e-posta adresi.");
		}

		if (!checkIfEmailExists(employer.getEmail())) {

			return new ErrorResult(employer.getEmail() + "Girdiğiniz email zaten mevcut.");
		}

		if (!checkIfEqualPasswordAndConfirmPassword(employer.getPassword(), confirmPassword)) {

			return new ErrorResult("Girdiğiniz parolalar uyuşmuyor.");
		}

		employerService.add(employer);
		String code = verificationService.sendCode(employer.getEmail());
		verificationCodeRecord(code, employer.getId());
		return new SuccessResult("Kayıtınız başarıyla tamamlandı");

	}

	@Override
	public Result registerJobseeker(JobSeeker jobSeeker, String confirmPassword) {

		if (checkIfRealPerson(Long.parseLong(jobSeeker.getNationalId()), jobSeeker.getFirstName(),
				jobSeeker.getLastName(), jobSeeker.getDateOfBirth().getYear()) == false) {
			return new ErrorResult("TC kimlik numaranız doğrulanamadı.");
		}

		if (!checkIfNullInfoForJobseeker(jobSeeker, confirmPassword)) {

			return new ErrorResult("Eksik bilgi girdiniz. Lütfen bütün boşlukları doldurun.");
		}

		if (!checkIfExistsTcNo(jobSeeker.getNationalId())) {

			return new ErrorResult(jobSeeker.getNationalId() + "Girdiğiniz TC kimlik numarası zaten mevcut.");
		}

		if (!checkIfEmailExists(jobSeeker.getEmail())) {

			return new ErrorResult(jobSeeker.getEmail() + "Girdiğiniz email zaten mevcut.");
		}

		
		jobSeekerService.add(jobSeeker);
		String code = verificationService.sendCode(jobSeeker.getEmail());
		verificationCodeRecord(code, jobSeeker.getId());
		return new SuccessResult("Kayıtınız başarıyla tamamlandı");
	}

	// Validation for employer register ---START---

	private boolean checkIfNullInfoForEmployer(Employer employer) {

		if (employer.getCompanyName() != null && employer.getWebsite() != null && employer.getEmail() != null
				&& employer.getPhoneNumber() != null && employer.getPassword() != null) {

			return true;

		}

		return false;
	}

	private boolean checkIfEqualEmailAndDomain(String email, String website) {
		String[] emailArr = email.split("@", 2);
		String domain = website.substring(4, website.length());

		if (emailArr[1].equals(domain)) {

			return true;
		}

		return false;
	}

	// Validation for employer register ---END---

	// Validation for jobseeker register ---START---
	
	private boolean checkIfNullInfoForJobseeker(JobSeeker jobSeeker, String confirmPassword) {

		if (jobSeeker.getFirstName() != null && jobSeeker.getLastName() != null && jobSeeker.getNationalId() != null
				&& jobSeeker.getDateOfBirth() != null && jobSeeker.getPassword() != null && jobSeeker.getEmail() != null
				&& confirmPassword != null) {

			return true;

		}

		return false;
	}

	private boolean checkIfExistsTcNo(String nationalId) {

		if (this.jobSeekerService.getJobseekerByNationalId(nationalId).getData() == null) {
			return true;
		}
		return false;
	}

	private boolean checkIfRealPerson(long nationalId, String firstName, String lastName, int yearOfBirth) {

		if (validationService.validateByMernis(nationalId, firstName, lastName, yearOfBirth)) {
			return true;
		}
		return false;
	}

	// Validation for jobseeker register ---END---

	// Common Validation

	private boolean checkIfEmailExists(String email) {

		if (this.userService.getUserByEmail(email).getData() == null) {

			return true;
		}

		return false;
	}

	private boolean checkIfEqualPasswordAndConfirmPassword(String password, String confirmPassword) {

		if (!password.equals(confirmPassword)) {
			return false;
		}

		return true;
	}
	
	private void verificationCodeRecord(String code, int id) {
		
		VerificationCode verificationCode = new VerificationCode(id, code, false, LocalDate.now());
		this.verificationCodeService.add(verificationCode);
	
	}
}
