package com.softtek.proyecto.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Director")
public class Director {
	
	@Id
	@Column(name = "directorId")
	private Long directorId;
	
	@Column(name = "directorName")
	private String directorName;
	
	public Long getDirectorId() {
		return directorId;
	}
	public void setDirectorId(Long directorId) {
		this.directorId = directorId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	
	@Override
	public String toString() {
		return "Director [directorId=" + directorId + ", directorName=" + directorName + "]";
	}
	
	
	

}
