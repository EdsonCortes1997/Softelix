package com.softtek.proyecto.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softtek.proyecto.movies.entity.Comments;
import com.softtek.proyecto.movies.repository.CommentsRepository;

@Repository
public class CommentsServiceImpl implements CommentsService {

	@Autowired
	private CommentsRepository commentsRepository;

	@Override
	public List<Comments> getAllComments() {
		return (List<Comments>) commentsRepository.findAll();
	}

	@Override
	public Comments getCommentsById (final Integer id) {
		Comments comments = (Comments) this.commentsRepository.findById(id).orElse(null);
		return comments;
	}

	@Override
	public Comments addComments(Comments comments) {
		return this.commentsRepository.save(comments);
	}

	@Override
	public Comments updateComments(Comments comments) {
		return commentsRepository.save(comments);
	}

	@Override
	public boolean deleteCommentsById(Integer id) {
		this.commentsRepository.deleteById(id);
		return true;
	}

	@Override
	public String getCommentsByTitle(String comment) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	}
