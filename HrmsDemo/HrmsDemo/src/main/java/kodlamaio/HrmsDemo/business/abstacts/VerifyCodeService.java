package kodlamaio.HrmsDemo.business.abstacts;

import kodlamaio.HrmsDemo.core.utilities.results.Result;

public interface VerifyCodeService {
	Result add (int UserId);
	String generateCode ();
}
