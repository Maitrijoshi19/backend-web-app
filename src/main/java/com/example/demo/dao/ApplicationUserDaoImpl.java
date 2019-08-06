package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ApplicationUser;
import com.example.demo.repository.ApplicationUserRepository;

@Repository
public class ApplicationUserDaoImpl implements ApplicationUserDao{

	@Autowired
	private ApplicationUserRepository applicationUserRepository;

	@Override
	public List<ApplicationUser> findAll() {
		return applicationUserRepository.findAll();
	}
}
