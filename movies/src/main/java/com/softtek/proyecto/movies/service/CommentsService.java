package com.softtek.proyecto.movies.service;

import java.util.List;

import com.softtek.proyecto.movies.entity.Comments;



public interface CommentsService {
	
	public List<Comments> getAllComments();

	public Comments getCommentsById(Integer id);

	public Comments addComments (Comments Comments);

	public Comments updateComments (Comments Comments);

	public boolean deleteCommentsById(Integer id);

	public String getCommentsByTitle(String comment);

}