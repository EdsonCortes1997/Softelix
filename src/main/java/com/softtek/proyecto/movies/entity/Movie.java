package com.softtek.proyecto.movies.entity;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="movie")
public class Movie implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "movie_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movie_Id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "year")
	private Date year ;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "country_Id" )
	private Country country_Id;
	
	@ManyToOne(fetch=FetchType.EAGER )
	@JoinColumn(name = "classification_Id")
	private Classification classification_Id;
	
	
	public Integer getMovieId() {
		return movie_Id;
	}
	public void setMovieId(Integer movie_Id) {
		this.movie_Id = movie_Id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public Country getCountryId() {
		return country_Id;
	}
	public void setCountryId(Country country_Id) {
		this.country_Id = country_Id;
	}
	public Classification getClassificationId() {
		return classification_Id;
	}
	public void setClassificationId(Classification classification_Id) {
		this.classification_Id = classification_Id;
	}
	
	
	
	

}
