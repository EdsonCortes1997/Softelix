package com.softtek.proyecto.movies.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="classification")
public class Classification implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer classification_Id;
	
	private String classification_Name;
	
	public Integer getClassificationId() {
		return classification_Id;
	}
	public void setClassificationId(Integer classification_Id) {
		this.classification_Id = classification_Id;
	}
	public String getClassificationName() {
		return classification_Name;
	}
	public void setClassificationName(String classification_Name) {
		this.classification_Name = classification_Name;
	}
	
	
	

}