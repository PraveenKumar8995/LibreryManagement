package com.sample.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.firstproject.model.Books;
import com.sample.firstproject.service.BookService;

@RestController
public class BooksController {

	@Autowired
	BookService bookService;
	
	@GetMapping(value="/books")
	public List<Books> getBookList()
	{
		return bookService.getBookList();
	}
	
	
	@GetMapping("/books/{bookId}")
	public Books getBooksbyId(@PathVariable Integer bookId)  //@PathVariable used to extract the value from the URI
	{
		return bookService.getBooksById(bookId);
	}
	
	
	@PostMapping ("/books")
	public ResponseEntity<String> insertBooks(@RequestBody Books books)
	{
		String status =(bookService.insertBooks(books) !=null) ? "Success" : "Failed";
		
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping(value="/authors")
	public List<String> listAuthor()
	{
		return bookService.listAuthor();
	}
}
