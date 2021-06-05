package kodlamaio.HrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HrmsDemo.business.abstacts.CandidateJobExperienceService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.dataAccess.abstarcts.CandidateJobExperienceDao;
import kodlamaio.HrmsDemo.entities.concretes.CandidateJobExperience;

@Service
public class CandidateJobExperienceManager implements CandidateJobExperienceService{

	private CandidateJobExperienceDao candidateJobExperienceDao;
	
	@Autowired
	public CandidateJobExperienceManager(CandidateJobExperienceDao candidateJobExperienceDao) {
		super();
		this.candidateJobExperienceDao = candidateJobExperienceDao;
	}

	@Override
	public DataResult<List<CandidateJobExperience>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CandidateJobExperience>>(this.candidateJobExperienceDao.findAll(),"Başarılı Şekilde İş adayının deneyimleri listelendi");
	}

}