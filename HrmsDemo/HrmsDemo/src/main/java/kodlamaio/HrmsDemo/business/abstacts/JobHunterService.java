package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.entities.concretes.JobHunter;

public interface JobHunterService {
	Result add(JobHunter jobHunt);
	Result update(JobHunter jobHunt);
	Result delete(JobHunter jobHunt);
	
	DataResult<List<JobHunter>> getAll();
	DataResult<JobHunter> get(int id);
}
