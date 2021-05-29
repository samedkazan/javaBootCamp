package kodlamaio.HrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HrmsDemo.business.abstacts.CityService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.dataAccess.abstarcts.CityDao;
import kodlamaio.HrmsDemo.entities.concretes.City;

@Service
public class CityManager implements CityService {

	private CityDao cityDao;
	
   @Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"All City Listed!");
	}
}
