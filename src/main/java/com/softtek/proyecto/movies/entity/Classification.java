package com.softtek.proyecto.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Classification")
public class Classification {
	
	@Id
	@Column(name = "ClassificationID")
	private Integer classificationId;
	
	@Column(name = "Classification")
	private String classificationName;
	
	public Integer getClassificationId() {
		return classificationId;
	}
	public void setClassificationId(Integer classificationId) {
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