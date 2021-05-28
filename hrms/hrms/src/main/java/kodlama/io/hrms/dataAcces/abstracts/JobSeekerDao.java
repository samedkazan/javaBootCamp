package kodlama.io.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlama.io.hrms.entites.concretes.JobSeeker;



public interface  JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

	JobSeeker findJobseekerByNationalId(String nationalId);
}
 


