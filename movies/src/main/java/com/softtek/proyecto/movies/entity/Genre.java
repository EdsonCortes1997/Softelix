package com.softtek.proyecto.movies.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genre")
public class Genre implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer genre_Id;
	
	private String genre_Name;
	
	
	public Integer getGenreId() {
		return genre_Id;
	}
	public void setGenreId(Integer genre_Id) {
		this.genre_Id = genre_Id;
	}
	public String getGenreName() {
		return genre_Name;
	}
	public void setGenreName(String genre_Name) {
		this.genre_Name = genre_Name;
	}
	
	

}
