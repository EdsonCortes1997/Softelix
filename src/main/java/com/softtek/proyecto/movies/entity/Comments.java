package com.softtek.proyecto.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Comments")
public class Comments {
	
	@Id
	@Column(name = "CommentID")
	private Integer commentId;
	
	@Column(name = "Comment")
	private String comment;
	
	@Column(name = "MovieID")
	private Movie movieId;
	
	@Column(name = "UserID")
	private User userId;
	
	@Column(name = "User")
	private String user;
	
	
	public Integer getCommentId() {
		return commentId;
	}
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Movie getMovieId() {
		return movieId;
	}
	public void setMovieId(Movie movieId) {
		this.movieId = movieId;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Comments [commentId=" + commentId + ", comment=" + comment + ", movieId=" + movieId + ", userId="
				+ userId + ", user=" + user + "]";
	}

}
