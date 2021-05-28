package kodlama.io.hrms.dataAcces.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;


import kodlama.io.hrms.entites.concretes.Employee;


public interface EmployeeDao extends JpaRepository<Employee, Integer> {
   }