package com.softtek.proyecto.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRatings {

	@Id
	@Column(name = "MovieID")
	private Integer movieId;

	@Column(name = "Rating")
	private double rating;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "UserRatings [movieId=" + movieId + ", rating=" + rating + "]";
	}

}
