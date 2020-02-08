package com.softtek.proyecto.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Comments")
public class Comments {
	
	@Id
	@Column(name = "commentId")
	private Long commentId;
	
	@Column(name = "comment")
	private String comment;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="movieId")
	private Movie movieId;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "userId")
	private User userId;
	
	@Column(name = "user")
	private String user;
	
	
	public Long getCommentId() {
		return commentId;
	}
	public void setCommentId(Long commentId) {
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
