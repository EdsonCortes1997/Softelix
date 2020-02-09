package com.softtek.proyecto.movies.controller;

import java.net.MalformedURLException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.softtek.proyecto.movies.entity.Comments;
import com.softtek.proyecto.movies.service.CommentsService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class CommentController {

	private final Logger log = LoggerFactory.getLogger(CommentController.class);

	@Autowired
	private CommentsService commentsService;

	@GetMapping(value = "/comments/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Comments> getCommentList() {
		return commentsService.getAllComments();
	}

	@GetMapping(value = "/comment/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Comments getCommentById(@PathVariable("id") Integer id) {
		return commentsService.getCommentsById(id);
	}

	@PostMapping(value = "/comment/", produces = MediaType.APPLICATION_JSON_VALUE)
	public Comments addComment(@RequestBody Comments requestBody) {
		return commentsService.addComments(requestBody);
	}

	@PutMapping(value = "/comment/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Comments updateUser(@PathVariable("id") String comment, @RequestBody Comments requestBody) {
		return commentsService.updateComments(requestBody);
	}

	@DeleteMapping(value = "/delete/comment/{id}/")
	public void deleteUser(@PathVariable("id") Integer id) {
		commentsService.deleteCommentsById(id);
	}
}