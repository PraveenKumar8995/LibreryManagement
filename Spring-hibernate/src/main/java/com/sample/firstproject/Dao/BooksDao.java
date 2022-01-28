package com.sample.firstproject.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.firstproject.Repo.BooksRepo;
import com.sample.firstproject.model.Books;


@Component
public class BooksDao {
	
	@Autowired
	BooksRepo booksRepo;
	
	
	public List<Books> getBookList()
	{
		return booksRepo.findAll();
	}
	
	public Books getBookbyID(Integer bookId)
	{
		return booksRepo.getById(bookId);
	}
	
	public Books insertBook(Books books)
	{
		return booksRepo.save(books);
	}
	
	public List<String> listAuthor()
	{
		return booksRepo.getAuthors();
	}

}
