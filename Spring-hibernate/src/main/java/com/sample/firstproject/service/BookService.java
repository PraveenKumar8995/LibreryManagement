package com.sample.firstproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.firstproject.Dao.BooksDao;
import com.sample.firstproject.model.Books;

@Service
public class BookService {

	@Autowired
	BooksDao booksDao;
	
	public List<Books> getBookList()
	{
		return booksDao.getBookList();
	}
	
	public Books getBooksById(Integer bookId)
	{
		return booksDao.getBookbyID(bookId);
	}
	
	public Books insertBooks(Books books)
	{
		return booksDao.insertBook(books);
	}
	
	public List<String> listAuthor()
	{
		return booksDao.listAuthor();
	}
}
