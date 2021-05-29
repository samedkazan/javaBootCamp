package kodlamaio.HrmsDemo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HrmsDemo.business.abstacts.CityService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {

	private CityService cityService;
    
	@Autowired
	public CitiesController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/getall")
    public DataResult<List<City>> getAll() {
        return this.cityService.getAll();
    }
	
}
