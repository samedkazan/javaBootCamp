package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.entities.concretes.Job;

public interface JobService {

	Result add(Job job);
	//Result update(Job job);
	//Result delete(Job job);
	
	DataResult<List<Job>> getAll();
	//DataResult<Job> get(int id);
}
