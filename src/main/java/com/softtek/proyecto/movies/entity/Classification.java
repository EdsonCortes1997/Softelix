package com.softtek.proyecto.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Classification")
public class Classification {
	
	@Id
	@Column(name = "classificationId")
	private Long classificationId;
	
	@Column(name = "classificationName")
	private String classificationName;
	
	public Long getClassificationId() {
		return classificationId;
	}
	public void setClassificationId(Long classificationId) {
		this.classificationId = classificationId;
	}
	public String getClassificationName() {
		return classificationName;
	}
	public void setClassificationName(String classificationName) {
		this.classificationName = classificationName;
	}
	@Override
	public String toString() {
		return "Classification [classificationId=" + classificationId + ", classificationName=" + classificationName
				+ "]";
	}
	
	

}