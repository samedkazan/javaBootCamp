package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.entities.concretes.Employer;

public interface EmployerService {
	Result add(Employer employer);
	//Result update(Employer employer);
	//Result delete(Employer employer);
	
	DataResult<List<Employer>> getAll();
	//DataResult<Employer> get(int id);
}
