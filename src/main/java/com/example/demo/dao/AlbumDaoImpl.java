package com.example.demo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Album;
import com.example.demo.repository.AlbumRepository;

@Repository
public class AlbumDaoImpl implements AlbumDao{

	@Autowired
	private AlbumRepository albumRepository;

	@Override
	public List<Album> findByUserId(int user_id) {
		
		return albumRepository.findByUserId(user_id);
		//return albumRepository.findAll();
	}
	
	@Override
	public Album findById(int album_id, int user_id) {		
		return albumRepository.findById(album_id, user_id);
	}
}
