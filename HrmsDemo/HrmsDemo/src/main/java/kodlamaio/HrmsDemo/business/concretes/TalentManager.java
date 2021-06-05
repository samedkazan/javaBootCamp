package kodlamaio.HrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HrmsDemo.business.abstacts.TalentService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.dataAccess.abstarcts.TalentDao;
import kodlamaio.HrmsDemo.entities.concretes.Talent;

@Service
public class TalentManager implements TalentService{

	private TalentDao talentDao;

	@Autowired
	public TalentManager(TalentDao talentDao) {
		super();
		this.talentDao = talentDao;
	}
	
	@Override
	public DataResult<List<Talent>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Talent>>(this.talentDao.findAll(),"Yetenekler Listelendi");
	}



}
