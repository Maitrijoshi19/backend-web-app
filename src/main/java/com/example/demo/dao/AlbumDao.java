package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Album;

public interface AlbumDao {

	public List<Album> findByUserId(int user_id);
	public Album findById(int user_id, int album_id);

}
