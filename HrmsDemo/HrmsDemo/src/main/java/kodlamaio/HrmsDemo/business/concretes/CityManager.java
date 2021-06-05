package kodlamaio.HrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.HrmsDemo.business.abstacts.CityService;
import kodlamaio.HrmsDemo.core.utilities.business.BusinessEngine;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.ErrorDataResult;
import kodlamaio.HrmsDemo.core.utilities.results.ErrorResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.HrmsDemo.core.utilities.results.SuccessResult;
import kodlamaio.HrmsDemo.dataAccess.abstarcts.CityDao;
import kodlamaio.HrmsDemo.entities.concretes.City;

@Service
public class CityManager implements CityService{
	
	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		// TODO Auto-generated method stub
		//Result engine = BusinessEngine.run(null);
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Başarılı Şekilde Şehirler Listelendi");
	}

	@Override
	public DataResult<City> add(City city) {
		// TODO Auto-generated method stub
		Result engine = BusinessEngine.run(cityNameChecker(city));
		if(!engine.isSuccess()) {
			return new ErrorDataResult(null,engine.getMessage());
		}
		return new SuccessDataResult<City>(this.cityDao.save(city),"Başarılı Şekilde Eklendi");
	}
	
	private Result cityNameChecker(City city) {
		if(city.getCityName().isEmpty() || city.getCityName().isBlank()) {
			return new ErrorResult("Şehir Adı Girilmek Zorunda");
		}
		return new SuccessResult();
	}
	

}