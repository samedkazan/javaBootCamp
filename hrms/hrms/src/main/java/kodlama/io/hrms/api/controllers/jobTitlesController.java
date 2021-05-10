package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstarcts.JobTitleService;
import kodlama.io.hrms.entites.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitle")

public class jobTitlesController {
	private JobTitleService jobTitleService;

	public jobTitlesController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	@GetMapping("/getAll")
	public List<JobTitle>getAll(){
		return this.jobTitleService.getAll();
	}
	
}
