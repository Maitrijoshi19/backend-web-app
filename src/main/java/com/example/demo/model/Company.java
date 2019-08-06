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
@Table(name = "company")
public class Company implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long company_id;

	@Column(name = "name")
	private String name;

	@Column(name = "catch_phrase")
	private String catch_phrase;

	@Column(name = "bs")
	private String bs;

	@OneToOne
	@JoinColumn(name = "user_id", nullable = false)
	@JsonBackReference
	private ApplicationUser applicationUser;
	
	public Company() {

	}

	public Long getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatch_phrase() {
		return catch_phrase;
	}

	public void setCatch_phrase(String catch_phrase) {
		this.catch_phrase = catch_phrase;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

	public ApplicationUser getApplicationUser() {
		return applicationUser;
	}

	public void setApplicationUser(ApplicationUser applicationUser) {
		this.applicationUser = applicationUser;
	}


	
}
