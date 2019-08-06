package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "geo")
public class Geo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long geo_id;

	@Column(name = "lat")
	private String lat;

	@Column(name = "lng")
	private String lng;

	@OneToOne
	@JoinColumn(name = "address_id", nullable = false)
	@JsonBackReference
	private Address address;

	public Geo() {

	}

	public Long getGeo_id() {
		return geo_id;
	}

	public void setGeo_id(Long geo_id) {
		this.geo_id = geo_id;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}
