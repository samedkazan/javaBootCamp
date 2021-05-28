package kodlama.io.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entites.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

	User findUserByEmail(String email);
}
