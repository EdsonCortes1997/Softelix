package com.softtek.proyecto.movies.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.softtek.proyecto.movies.entity.Classification;
import com.softtek.proyecto.movies.service.ClassificationService;
import com.softtek.proyecto.movies.service.ClassificationServiceImpl;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class ClassificationController {
	
	private final Logger log = LoggerFactory.getLogger(ClassificationController.class);

	@Autowired
	private ClassificationServiceImpl classificationServiceImpl;
	
	@GetMapping (value = "/classifications/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Classification> getClassificationList(){
		return classificationServiceImpl.getAllClassifications();
	}
	
	@GetMapping (value = "/classification/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Classification getClassificationById(@PathVariable("id") Integer id){
		return classificationServiceImpl.getClassificationById(id);
	}
	
	@PostMapping (value = "/classification/", produces = MediaType.APPLICATION_JSON_VALUE)
	public Classification addClassification(@RequestBody Classification requestBody){
		return classificationServiceImpl.addClassification(requestBody);
	}
	
	@PutMapping(value = "/classification/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	 public Classification updateUser(@PathVariable("id") String classification, @RequestBody Classification requestBody) {
		 return classificationServiceImpl.updateClassification(requestBody);
	 }
	
	@DeleteMapping(value = "/delete/classification/{id}/")
	public void deleteUser(@PathVariable("id") Integer id) {
		classificationServiceImpl.deleteClassificationById(id);
	}}
	