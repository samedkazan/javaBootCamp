package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.Employer;

public interface EmployerService {
	DataResult<Employer> add(Employer employer);
	DataResult<List<Employer>>getAll();
}
