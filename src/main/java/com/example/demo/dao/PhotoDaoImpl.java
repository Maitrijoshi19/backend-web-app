package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Photo;
import com.example.demo.repository.PhotoRepository;

@Repository
public class PhotoDaoImpl implements PhotoDao{

	@Autowired
	private PhotoRepository photoRepository;

	@Override
	public List<Photo> findByUserId(int user_id) {
		
		return photoRepository.findByUserId(user_id);
		//return albumRepository.findAll();
	}
	
	@Override
	public Photo findById(int photo_id, int user_id) {		
		return photoRepository.findById(photo_id, user_id);
	}
}
