package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Photo;

public interface PhotoDao {

	public List<Photo> findByUserId(int user_id);
	public Photo findById(int photo_id, int user_id);

}
