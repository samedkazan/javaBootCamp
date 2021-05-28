package kodlama.io.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entites.concretes.VerificationCode;

public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer>{

}