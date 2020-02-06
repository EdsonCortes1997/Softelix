package com.softtek.proyecto.movies.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Movie")
public class Movie {
	
	@Id
	@Column(name = "MovieID")
	Integer movieId;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "Year")
	private java.util.Date year ;
	
	@Column(name = "CountryID")
	private Country countryId;
	
	@Column(name = "Title")
	private Classification classificationId;
	
	
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public java.util.Date getYear() {
		return year;
	}
	public void setYear(java.util.Date year) {
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
