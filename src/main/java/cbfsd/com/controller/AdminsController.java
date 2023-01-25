package cbfsd.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cbfsd.com.entity.Admin;
import cbfsd.com.service.AdminsService;



@RestController
@RequestMapping("admins")
@CrossOrigin
public class AdminsController {
	
	@Autowired
	AdminsService adminService;

	
	@PostMapping(value = "signIn")
	public String signInAdmin(@RequestBody Admin admin) {
		return adminService.signInAdmin(admin);
	}
	
}

//you got this Brandon