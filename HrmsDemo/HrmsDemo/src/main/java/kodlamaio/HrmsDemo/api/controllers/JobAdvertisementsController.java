package kodlamaio.HrmsDemo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HrmsDemo.business.abstacts.JobAdvertisementService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {

	private JobAdvertisementService advertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService advertisementService) {
		super();
		this.advertisementService = advertisementService;
	}
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll() {
		return this.advertisementService.getAll();
	}
	@GetMapping("/getallbydate")
	public DataResult<List<JobAdvertisement>> getAllByDate() {
		return this.advertisementService.getAllSortedByDate();
	}
	@GetMapping("/getallbyactive")
	public DataResult<List<JobAdvertisement>> getAllByActive() {
		return this.advertisementService.getAllSortedByActive();
	}
	@PostMapping("/add")
	   public void add(@RequestBody JobAdvertisement advertisement) {
	       this.advertisementService.add(advertisement);
	  }
	    @PostMapping("/update")
	   public void update(@RequestBody JobAdvertisement advertisement) {
	       this.advertisementService.update(advertisement);
	    }
	
	
}