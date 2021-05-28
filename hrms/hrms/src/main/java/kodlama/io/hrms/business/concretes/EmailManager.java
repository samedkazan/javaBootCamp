package kodlama.io.hrms.business.concretes;

import org.springframework.stereotype.Component;

import kodlama.io.hrms.business.abstarcts.EmailService;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.entites.concretes.User;

@Component
public class EmailManager implements EmailService {
    @Override
    public Result sendEmail(User user) {
        return new SuccessResult("E-posta başarıyla şu adrese gönderildi: " + user.getEmail());
    }
}