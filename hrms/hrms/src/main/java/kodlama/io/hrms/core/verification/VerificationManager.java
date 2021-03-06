package kodlama.io.hrms.core.verification;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class VerificationManager implements VerificationService{

		@Override
		public void sendLink(String email) {
			UUID uuid = UUID.randomUUID();
			String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
			System.out.println("Verification link has been sent to " + email );
			System.out.println("Please click on the link to verify your account:  " + verificationLink );
		}

		@Override
		public String sendCode(String email) {
			UUID uuid = UUID.randomUUID();
			String verificationCode = uuid.toString();
			System.out.println("Verification link has been sent to " + email );
			System.out.println("Your activation code:  " + verificationCode );
			return verificationCode;
		}
	}
