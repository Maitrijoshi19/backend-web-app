package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
	@Query("from Album as album where album.applicationUser.user_id = :user_id")
	public List<Album> findByUserId(int user_id);
	
	@Query("from Album as album where album.album_id = :album_id and album.applicationUser.user_id = :user_id")
	public Album findById(int album_id, int user_id);
}