package com.softtek.proyecto.movies.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer country_Id;
	
	private String country_Name;

	public Integer getCountryId() {
		return country_Id;
	}

	public void setCountryId(Integer country_Id) {
		this.country_Id = country_Id;
	}

	public String getCountryName() {
		return country_Name;
	}

	public void setCountryName(String country_Name) {
		this.country_Name = country_Name;
	}

	

}
