package kodlamaio.HrmsDemo.dataAccess.abstarcts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HrmsDemo.entities.concretes.City;

public interface CityDao extends JpaRepository<City,Integer>{
	boolean  existsById(int id);
}
