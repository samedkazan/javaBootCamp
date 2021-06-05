package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.CandidateJobExperience;

public interface CandidateJobExperienceService {
	DataResult<List<CandidateJobExperience>> getAll();
}
