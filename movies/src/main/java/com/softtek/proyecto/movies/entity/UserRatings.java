package com.softtek.proyecto.movies.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="user_ratings")
public class UserRatings implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@JoinColumn(name = "movie_Id")
	private Integer movie_Id;

	private double rating;

	public Integer getMovieId() {
		return movie_Id;
	}

	public void setMovieId(Integer movie_Id) {
		this.movie_Id = movie_Id;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}


}
