package kodlamaio.HrmsDemo.dataAccess.abstarcts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HrmsDemo.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer> {

	Job findByName(String name);
}
