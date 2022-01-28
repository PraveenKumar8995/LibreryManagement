package com.sample.firstproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.firstproject.dao.BooksDao;
import com.sample.firstproject.model.Books;


@Component
public class BookServiceImpl {
	
	@Autowired
	BooksDao booksDao;
	
	public Books getbook()
	{
		return booksDao.getListOfBooks();
	}

}
