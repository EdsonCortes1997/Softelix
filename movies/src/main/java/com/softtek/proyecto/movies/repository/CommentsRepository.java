package com.softtek.proyecto.movies.repository;

import org.springframework.data.repository.CrudRepository;

import com.softtek.proyecto.movies.entity.Comments;




public interface CommentsRepository extends CrudRepository<Comments, Integer>{

	
}
