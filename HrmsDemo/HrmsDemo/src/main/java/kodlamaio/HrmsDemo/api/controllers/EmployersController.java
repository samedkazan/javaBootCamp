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
	
	private EmployerService employerService;
    
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
//	@GetMapping("/get/{id}")
//	public Employer get( @PathVariable("id") int id){
//		return this.employerService.get(id);
//	}
	@PostMapping("/add")
	public void add(@RequestBody Employer employer) {
		this.employerService.add(employer);
	}
//	@PostMapping("/update")
//	public void update(@RequestBody Employer employer) {
//		this.employerService.update(employer);
//	}
//	@PostMapping("/delete")
//	public void delete(@RequestBody Employer employer) {
//		this.employerService.delete(employer);
//	}
	
	

}
