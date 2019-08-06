package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "album")
public class Album implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int album_id;

	@Column(name = "title")
	private String title;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	@JsonBackReference
	private ApplicationUser applicationUser;


	public int getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ApplicationUser getApplicationUser() {
		return applicationUser;
	}

	public void setApplicationUser(ApplicationUser applicationUser) {
		this.applicationUser = applicationUser;
	}

	
	
}
