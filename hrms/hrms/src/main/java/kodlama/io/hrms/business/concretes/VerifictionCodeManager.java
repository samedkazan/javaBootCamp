package kodlama.io.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstarcts.VerificationCodeService;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAcces.abstracts.VerificationCodeDao;
import kodlama.io.hrms.entites.concretes.VerificationCode;

@Service
public class VerifictionCodeManager implements VerificationCodeService{

	private VerificationCodeDao verificationCodeDao;
	
	@Autowired
	public VerifictionCodeManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}

	@Override
	public Result add(VerificationCode code) {
		this.verificationCodeDao.save(code);
		return new SuccessResult("Kod kaydedildi.");
	}

//	@Override
//	public Result delete(VerificationCode code) {
//		this.verificationCodeDao.delete(code);
//		return new SuccessResult("Kod silindi.");
//	}
//
//	@Override
//	public Result update(VerificationCode code) {
//		this.verificationCodeDao.save(code);
//		return new SuccessResult("Kod güncellendi.");
//	}
//
//	@Override
//	public DataResult<VerificationCode> getById(int id) {
//		return new SuccessDataResult<VerificationCode>(this.verificationCodeDao.getOne(id));
//	}
//
//	@Override
//	public DataResult<List<VerificationCode>> getAll() {
//		return new SuccessDataResult<List<VerificationCode>>(this.verificationCodeDao.findAll());
//	}

}
