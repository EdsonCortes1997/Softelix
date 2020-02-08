package com.softtek.proyecto.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRatings {

	@Id
	@Column(name = "movieId")
	private Long movieId;

	@Column(name = "rating")
	private double rating;

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
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
