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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "address")
public class Address implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long address_id;

	@Column(name = "street")
	private String street;

	@Column(name = "suite")
	private String suite;

	@Column(name = "city")
	private String city;

	@Column(name = "zipcode")
	private String zipcode;

	@OneToOne
	@JoinColumn(name = "user_id", nullable = false)
	@JsonBackReference
	private ApplicationUser applicationUser;
	
	@OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "address")
    @JsonManagedReference
    private Geo geo;

	public Address() {

	}

	public Long getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Long address_id) {
		this.address_id = address_id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public ApplicationUser getApplicationUser() {
		return applicationUser;
	}

	public void setApplicationUser(ApplicationUser applicationUser) {
		this.applicationUser = applicationUser;
	}

	public Geo getGeo() {
		return geo;
	}

	public void setGeo(Geo geo) {
		this.geo = geo;
	}
	
	

}
