package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.CandidateTalent;

public interface CandidateTalentService {
	DataResult<List<CandidateTalent>> getAll();
}
