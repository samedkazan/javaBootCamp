package kodlamaio.HrmsDemo.core.utilities.verification;

import org.springframework.stereotype.Service;

@Service
	public class VerificationManager implements VerificationService {

		@Override
		public void verifyByCode(String code,String email) {
			
			
			
			System.out.println(code+"Code send your email :"+email);
			
		}

		@Override
		public void verifyByEmployee(int userId) {
			
			System.out.println("Verify by employer :" +userId);
			
		}
}

