package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PhotoDao;
import com.example.demo.model.Album;
import com.example.demo.model.Photo;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/photos")
public class PhotoController {

	@Autowired
	private PhotoDao photoDao;
	
	
	@GetMapping("/{user_id}")
	public List<Photo> findAll(@PathVariable int user_id) {
		return photoDao.findByUserId(user_id);
	}
	
	@GetMapping("/{photo_id}/{user_id}")
	public Photo findById(@PathVariable int photo_id, @PathVariable int user_id) {
		return photoDao.findById(photo_id, user_id);
	}
}
