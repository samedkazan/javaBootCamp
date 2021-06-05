package kodlamaio.HrmsDemo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HrmsDemo.business.abstacts.LanguageService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.dataAccess.abstarcts.LanguageDao;
import kodlamaio.HrmsDemo.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	
	
	private LanguageDao languageDao;
	
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}
	
	@Override
	public DataResult<List<Language>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Language>>(this.languageDao.findAll(),"Başarılı Şekilde iş arayanların dilleri geldi");
	}

	

}
