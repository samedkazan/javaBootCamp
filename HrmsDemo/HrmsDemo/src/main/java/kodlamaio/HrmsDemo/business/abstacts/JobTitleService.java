package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.JobTitle;

public interface JobTitleService {
	DataResult<JobTitle> add(JobTitle title);

	DataResult<List<JobTitle>> getAll();

	DataResult<List<JobTitle>> findById(int id);

	DataResult<List<JobTitle>> findJobTitles(String title);
}
