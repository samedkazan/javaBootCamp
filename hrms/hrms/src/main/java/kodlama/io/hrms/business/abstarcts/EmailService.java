package kodlama.io.hrms.business.abstarcts;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entites.concretes.User;

public interface EmailService {
	  Result sendEmail(User user);
}
