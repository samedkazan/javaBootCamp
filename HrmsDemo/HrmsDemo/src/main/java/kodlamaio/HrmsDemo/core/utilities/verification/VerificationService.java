package kodlamaio.HrmsDemo.core.utilities.verification;

public interface VerificationService {
	void verifyByCode (String code,String email);
	void verifyByEmployee(int userId);
}
