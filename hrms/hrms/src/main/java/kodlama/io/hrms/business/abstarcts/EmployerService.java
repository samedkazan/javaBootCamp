package kodlama.io.hrms.business.abstarcts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entites.concretes.Employer;

public interface EmployerService {

	Result add(Employer employer);
//	Result update(Employer employer);
//	Result delete(int id);
//	DataResult<Employer> getById(int id);
	
	DataResult<List<Employer>> getAll();
}