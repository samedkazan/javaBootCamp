package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.Candidate;

public interface CandidateService {
	DataResult<Candidate> add(Candidate candidate);
	DataResult<List<Candidate>> getAll();
}
