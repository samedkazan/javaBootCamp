package kodlamaio.HrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HrmsDemo.business.abstacts.JobTitleService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.ErrorDataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.dataAccess.abstarcts.JobTitleDao;
import kodlamaio.HrmsDemo.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	
	@Autowired
	private JobTitleDao jobTitleDao;
	
	public JobTitleManager() {
		
	}
	
	@Override
	public DataResult<List<JobTitle>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobTitle>>(jobTitleDao.findAll(),"Başarılı Şekilde Listelendi");
	}

	@Override
	public DataResult<List<JobTitle>> findById(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findById(id),"Başarı Şekilde Listelendi");
	}

	@Override
    public DataResult<List<JobTitle>> findJobTitles(String title) {
        return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findJobTitles(title),"Başarı Şekilde Listelendi");
    }

	@Override
	public DataResult<JobTitle> add(JobTitle title) {
		// TODO Auto-generated method stub
		if(jobTitleDao.findAllByTitle(title.getTitle()).stream().count() !=0 ) {
			return new ErrorDataResult<JobTitle>(null,"Böyle Bir İş Pozisyonu Zaten Kayıtlı");
			
		}
		return new SuccessDataResult<JobTitle>(this.jobTitleDao.save(title),"Başarıyla İş Pozisyonu Eklendi");
		
	}

}