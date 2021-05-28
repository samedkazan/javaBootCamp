package kodlama.io.hrms.business.abstarcts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entites.concretes.JobPosition;

public interface JobPositionService {
	Result add(JobPosition jobPosition);
//	Result update(JobPosition jobPosition);
//	Result delete(int id);
//	DataResult<JobPosition> getById(int id);
	
	DataResult<List<JobPosition>> getAll();
	DataResult<JobPosition> getJobByTitle(String title);
}
