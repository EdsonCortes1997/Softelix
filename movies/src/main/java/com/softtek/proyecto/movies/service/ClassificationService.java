package com.softtek.proyecto.movies.service;

import java.util.List;

import com.softtek.proyecto.movies.entity.Classification;



public interface ClassificationService {
	
	public List<Classification> getAllClassifications();

	public Classification getClassificationById(Integer id);

	public Classification addClassification (Classification Classification);

	public Classification updateClassification(Classification Classification);

	public boolean deleteClassificationById(Integer id);

	public String getClassificationByTitle(String classification);

	

	

}