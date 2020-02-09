package com.softtek.proyecto.movies.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comments implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private Integer comment_Id;
	
	private String comment;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="movie_Id")
	private Movie movie_Id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "user_Id")
	private User user_Id;
	
	private String user;
	
	
	public Integer getCommentId() {
		return comment_Id;
	}
	public void setCommentId(Integer comment_Id) {
		this.comment_Id = comment_Id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Movie getMovieId() {
		return movie_Id;
	}
	public void setMovieId(Movie movie_Id) {
		this.movie_Id = movie_Id;
	}
	public User getUserId() {
		return user_Id;
	}
	public void setUserId(User user_Id) {
		this.user_Id = user_Id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	

}
