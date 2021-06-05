package kodlamaio.HrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HrmsDemo.business.abstacts.CandidateTalentService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.dataAccess.abstarcts.CandidateTalentDao;
import kodlamaio.HrmsDemo.entities.concretes.CandidateTalent;

@Service
public class CandidateTalentManager implements CandidateTalentService{
	
	private CandidateTalentDao candidateTalentDao;
	
	@Autowired
	public CandidateTalentManager(CandidateTalentDao candidateTalentDao) {
		this.candidateTalentDao = candidateTalentDao;
	}
	

	@Override
	public DataResult<List<CandidateTalent>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CandidateTalent>>(this.candidateTalentDao.findAll(),"Başarılı Şekilde İŞ Arayanın Yetenekleri Listelendi");
	}

}
