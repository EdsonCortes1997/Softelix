package com.softtek.proyecto.movies.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Movie")
public class Movie {
	
	@Id
	private Integer movieId;
	private String title;
	private java.util.Date year ;
	private Integer countryId;
	private Integer directorId;
	private Integer clasificationId;
	
	
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
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public Integer getDirectorId() {
		return directorId;
	}
	public void setDirectorId(Integer directorId) {
		this.directorId = directorId;
	}
	public Integer getClasificationId() {
		return clasificationId;
	}
	public void setClasificationId(Integer clasificationId) {
		this.clasificationId = clasificationId;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", year=" + year + ", countryId=" + countryId
				+ ", directorId=" + directorId + ", clasificationId=" + clasificationId + "]";
	}
	
	
	

}
