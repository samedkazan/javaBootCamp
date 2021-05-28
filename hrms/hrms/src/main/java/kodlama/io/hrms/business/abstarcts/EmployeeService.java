package kodlama.io.hrms.business.abstarcts;


import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;

import kodlama.io.hrms.entites.concretes.Employee;

public interface EmployeeService {
//	Result add(Employee employee);
//	Result update(Employee employee);
//	Result delete(int id);
//	DataResult<Employee> getById(int id);
	
	DataResult<List<Employee>> getAll();
}
