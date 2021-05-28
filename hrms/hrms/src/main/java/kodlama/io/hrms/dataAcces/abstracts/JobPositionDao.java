package kodlama.io.hrms.dataAcces.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;


import kodlama.io.hrms.entites.concretes.JobPosition;


public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	JobPosition findByJobTitle(String title);
}
