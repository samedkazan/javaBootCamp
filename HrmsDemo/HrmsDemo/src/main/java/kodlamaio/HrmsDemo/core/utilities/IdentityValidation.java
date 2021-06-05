package kodlamaio.HrmsDemo.core.utilities;

import kodlamaio.HrmsDemo.core.utilities.results.ErrorResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessResult;
import kodlamaio.HrmsDemo.services.FakeMernis;

public class IdentityValidation {
	public static Result isRealPerson(String tcno) {
		FakeMernis mernis = new FakeMernis();
		if(FakeMernis.validate(tcno) == true) {
			return new SuccessResult();
		}
		return new ErrorResult("Türkiye cumhuriyeti kimliği olmak zorunda.");
	}
}