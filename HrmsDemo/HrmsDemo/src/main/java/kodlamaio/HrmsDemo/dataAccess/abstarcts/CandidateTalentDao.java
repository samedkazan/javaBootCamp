package kodlamaio.HrmsDemo.dataAccess.abstarcts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HrmsDemo.entities.concretes.CandidateTalent;

public interface CandidateTalentDao extends JpaRepository<CandidateTalent, Integer>{

}
