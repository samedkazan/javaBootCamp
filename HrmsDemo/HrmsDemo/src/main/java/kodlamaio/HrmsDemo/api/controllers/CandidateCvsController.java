package kodlamaio.HrmsDemo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HrmsDemo.business.abstacts.CandidateCvService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.entities.concretes.CandidateCv;

@RestController
@RequestMapping("api/cv")
public class CandidateCvsController {
	private CandidateCvService candidateCvService;
	
	@Autowired
	public CandidateCvsController(CandidateCvService candidateCvService) {
		this.candidateCvService = candidateCvService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CandidateCv>> getAll(){
		return this.candidateCvService.getAll();
	}
	
	@GetMapping("/findbycandidateid")
	public DataResult<List<CandidateCv>> findByCandidateId(@RequestParam int id) {
		// TODO Auto-generated method stub
		return this.candidateCvService.findByCandidateId(id);
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidateCv candidateCv){
		return this.candidateCvService.add(candidateCv);
	}
	
}
