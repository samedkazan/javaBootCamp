package kodlamaio.HrmsDemo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HrmsDemo.business.abstacts.UserService;
import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/getall")
	@ResponseBody
	public DataResult<List<User>> getAll() {
		return this.userService.getAll();
	}

}