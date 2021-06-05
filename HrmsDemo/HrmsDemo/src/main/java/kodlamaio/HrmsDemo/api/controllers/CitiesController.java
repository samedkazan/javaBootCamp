package kodlamaio.HrmsDemo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HrmsDemo.business.abstacts.CityService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.City;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/city")
@AllArgsConstructor
public class CitiesController {

	@Autowired
	private CityService cityService;

	@GetMapping("/getall")
	public DataResult<List<City>> getAll() {
		return this.cityService.getAll();
	}

	@PostMapping("/add")
	public DataResult<City> add(City city) {
		return this.cityService.add(city);
	}

}