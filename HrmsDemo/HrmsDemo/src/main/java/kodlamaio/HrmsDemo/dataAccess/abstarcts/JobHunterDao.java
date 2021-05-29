package kodlamaio.HrmsDemo.dataAccess.abstarcts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HrmsDemo.entities.concretes.JobHunter;

public interface JobHunterDao extends JpaRepository<JobHunter,Integer> {

	
	JobHunter findBynationalIdentity(String nationalIdentity);
}
