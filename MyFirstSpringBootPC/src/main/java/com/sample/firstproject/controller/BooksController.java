package com.sample.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.firstproject.model.Books;
import com.sample.firstproject.service.BookServiceImpl;

@RestController
public class BooksController {
	
	@Autowired
	BookServiceImpl bookServiceImpl;
	
	@GetMapping(value= "/books", produces ="application/json")
	@ResponseBody
	public Books getBooks()
	{
		return bookServiceImpl.getbook();
	}

}
