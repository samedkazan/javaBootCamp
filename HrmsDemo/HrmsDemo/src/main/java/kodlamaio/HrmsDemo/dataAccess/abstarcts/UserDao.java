package kodlamaio.HrmsDemo.dataAccess.abstarcts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HrmsDemo.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

	User findByEmail(String email);
	
}
