package com.softtek.proyecto.movies.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "director")
public class Director implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer director_Id;

	private String director_Name;

	public Integer getDirectorId() {
		return director_Id;
	}

	public void setDirectorId(Integer director_Id) {
		this.director_Id = director_Id;
	}

	public String getDirectorName() {
		return director_Name;
	}

	public void setDirectorName(String director_Name) {
		this.director_Name = director_Name;
	}

}
