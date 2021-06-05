package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.CandidateSchool;

public interface CandidateSchoolService {
	DataResult<List<CandidateSchool>> getAll();
	

	DataResult<List<CandidateSchool>> findByCandidateId(int id);


	DataResult<CandidateSchool> updateSchool(CandidateSchool candidateSchool);

}
