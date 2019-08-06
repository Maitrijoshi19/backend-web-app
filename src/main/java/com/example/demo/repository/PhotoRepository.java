package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Album;
import com.example.demo.model.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {
	//@Query("select photo.photo_id, photo.title, photo.url, photo.thumbnail_url from Photo as photo join photo.album as album on photo.album.album_id = album.album_id where album.applicationUser.user_id = :user_id")
	@Query("from Photo as photo join photo.album as album on photo.album.album_id = album.album_id where album.applicationUser.user_id = :user_id")
	public List<Photo> findByUserId(int user_id);
	
	@Query("from Photo as photo join photo.album as album on photo.album.album_id = album.album_id where photo.photo_id = :photo_id and album.applicationUser.user_id = :user_id")
	public Photo findById(int photo_id, int user_id);
}