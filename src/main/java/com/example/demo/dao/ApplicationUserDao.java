package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.ApplicationUser;

public interface ApplicationUserDao {

	public List<ApplicationUser> findAll();
	
}
