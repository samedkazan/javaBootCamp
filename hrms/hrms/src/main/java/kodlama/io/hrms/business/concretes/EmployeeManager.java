package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstarcts.EmployeeService;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAcces.abstracts.EmployeeDao;
import kodlama.io.hrms.entites.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

//	@Override
//	public Result add(Employee employee) {
//		this.employeeDao.save(employee);
//      return new SuccessResult("Çalışan eklendi.");		
//	}
//
//	@Override
//	public Result update(Employee employee) {
//		this.employeeDao.save(employee);
//      return new SuccessResult("Çalışan Güncellendi.");
//	}
//
//	@Override
//	public Result delete(int id) {
//		this.employeeDao.deleteById(id);
//      return new SuccessResult("Çalışan silindi.");
//	}
//
//	@Override
//	public DataResult<Employee> getById(int id) {
//		return new SuccessDataResult<Employee>(this.employeeDao.getOne(id));
//	}

	@Override
	public DataResult<List<Employee>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
	}

}