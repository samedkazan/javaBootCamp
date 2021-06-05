package kodlamaio.HrmsDemo.business.abstacts;

import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.entities.concretes.EmailVerification;

public interface EmailVerificationService {
	void generateCode(EmailVerification code, Integer id);
	Result verify(String verificationCode, Integer id);
}
