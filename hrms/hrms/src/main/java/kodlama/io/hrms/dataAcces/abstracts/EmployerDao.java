package kodlama.io.hrms.dataAcces.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;


import kodlama.io.hrms.entites.concretes.Employer;


public interface EmployerDao extends JpaRepository<Employer, Integer> {
    }