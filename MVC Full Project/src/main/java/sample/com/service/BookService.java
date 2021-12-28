package sample.com.service;

import java.util.List;

import sample.com.Model.*;
import sample.com.dao.*;

public class BookService {

BookDao bookDao = new BookDao();
	
	
	public List<Books> getBookList()
	{
		return bookDao.getBooksList();
	}
	
}
