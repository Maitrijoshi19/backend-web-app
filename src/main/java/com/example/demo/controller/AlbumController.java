package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AlbumDao;
import com.example.demo.model.Album;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/albums")
public class AlbumController {

	@Autowired
	private AlbumDao albumDao;
	
	
	@GetMapping("/{user_id}")
	public List<Album> findAll(@PathVariable int user_id) {
		return albumDao.findByUserId(user_id);
	}
	
	@GetMapping("/{album_id}/{user_id}")
	public Album findById(@PathVariable int album_id, @PathVariable int user_id) {
		return albumDao.findById(album_id, user_id);
	}
}
