package kodlamaio.HrmsDemo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HrmsDemo.business.abstacts.EmployerService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	@Autowired
	private EmployerService employerService;

	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}

	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll() {
		return this.employerService.getAll();
	}

	@PostMapping("/add")
	public DataResult<Employer> add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}

}