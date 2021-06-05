package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.City;

public interface CityService {
	DataResult<List<City>> getAll();

	DataResult<City> add(City city);
}
