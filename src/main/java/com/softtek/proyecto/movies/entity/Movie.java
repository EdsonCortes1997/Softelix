package com.softtek.proyecto.movies.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="likes")
public class Movie {
	
	@Id
	@Column(name = "movieId")
	Long movieId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "year")
	private Date year ;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "countryId")
	private Country countryId;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "classificationId")
	private Classification classificationId;
	
	
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
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
		return countryId;
	}
	public void setCountryId(Country countryId) {
		this.countryId = countryId;
	}
	public Classification getClassificationId() {
		return classificationId;
	}
	public void setClassificationId(Classification classificationId) {
		this.classificationId = classificationId;
	}
	
	
	
	

}
