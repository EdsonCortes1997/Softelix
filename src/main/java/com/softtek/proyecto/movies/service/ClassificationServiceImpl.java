package com.softtek.proyecto.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.softtek.proyecto.movies.entity.Classification;
import com.softtek.proyecto.movies.repository.ClassificationRepository;

public class ClassificationServiceImpl implements ClassificationService {

	@Autowired
	private ClassificationRepository classificationRepository;

	@Override
	public List<Classification> getAllClassifications() {
		return (List<Classification>) classificationRepository.findAll();
	}

	@Override
	public Classification getClassificationById (final Integer id) {
		Classification classification = this.classificationRepository.findById(id).orElse(null);
		return classification;
	}

	@Override
	public Classification addClassification(Classification classification) {
		return this.classificationRepository.save(classification);
	}

	@Override
	public Classification updateClassification(Classification classification) {
		return classificationRepository.save(classification);
	}

	@Override
	public boolean deleteClassificationById(Integer id) {
		this.classificationRepository.deleteById(id);
		return true;
	}

	
	@Override
	public String getClassificationByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}


