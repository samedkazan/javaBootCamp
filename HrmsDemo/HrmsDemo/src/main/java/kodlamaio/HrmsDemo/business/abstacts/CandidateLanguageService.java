package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.CandidateLanguage;

public interface CandidateLanguageService {
	DataResult<List<CandidateLanguage>> getAll();
}
