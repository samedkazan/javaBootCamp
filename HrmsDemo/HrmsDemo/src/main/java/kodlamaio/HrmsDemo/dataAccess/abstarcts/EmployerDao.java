package kodlamaio.HrmsDemo.dataAccess.abstarcts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HrmsDemo.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{

}