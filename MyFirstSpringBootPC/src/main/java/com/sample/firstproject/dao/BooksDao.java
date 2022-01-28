package com.sample.firstproject.dao;

import org.springframework.stereotype.Component;

import com.sample.firstproject.model.Books;

@Component
public interface BooksDao {
	
	public Books getListOfBooks();

}
