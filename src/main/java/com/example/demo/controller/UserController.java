package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ApplicationUserDao;
import com.example.demo.model.ApplicationUser;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private ApplicationUserDao applicationUserDao;
	
	
	@GetMapping
	public List<ApplicationUser> findAll() {
		return applicationUserDao.findAll();
	}
}
