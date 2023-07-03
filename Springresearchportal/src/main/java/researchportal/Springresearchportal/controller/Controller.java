package researchportal.Springresearchportal.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import researchportal.Springresearchportal.entity.User;
import researchportal.Springresearchportal.repo.RecomendationsRepo;
import researchportal.Springresearchportal.repo.UsersRepo;

public class Controller {
	String sessiontoken=UUID.randomUUID().toString();
	@Autowired
	UsersRepo usersRepo;
	@PostMapping("/registations")
	public String registation(@RequestBody User use) {
		if(use.equals(null)) {
			System.out.println("nv");
			return "nothing";
		}else {
			usersRepo.save(use);
			return "inserted";
		}
		
		
	}
}
