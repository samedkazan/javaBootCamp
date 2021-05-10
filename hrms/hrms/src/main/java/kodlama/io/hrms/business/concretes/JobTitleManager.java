package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstarcts.JobTitleService;
import kodlama.io.hrms.dataAcces.abstracts.JobTitleDao;
import kodlama.io.hrms.entites.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	
	@Autowired
	private JobTitleDao jobTitleDao;
	public JobTitleManager() {
		
	}
	
	@Override
	public List<JobTitle> getAll() {
		
		return this.jobTitleDao.findAll();
	}

}
