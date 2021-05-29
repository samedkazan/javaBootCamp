package kodlamaio.HrmsDemo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HrmsDemo.business.abstacts.AuthService;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.entities.concretes.Employer;
import kodlamaio.HrmsDemo.entities.concretes.JobHunter;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	private AuthService authService;
	
	@Autowired
	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/registerEmployer")
	public Result add(@RequestBody Employer employer,String confirmPass) {
		return this.authService.registerEmployer(employer, confirmPass);
	}
	
	@PostMapping("/registerJobHunter")
	public Result add(@RequestBody JobHunter jobHunter,String confirmPass) {
		return this.authService.registerJobHunter(jobHunter, confirmPass);
	}
	
	
}
