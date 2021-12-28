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
	
	public boolean insertBook(Books book)
	{
		book.setId((int) ((Math.random() *(100 - 20))  +20));
		
		return (bookDao.insertBook(book)>0)?true:false;     ///this is similar to IF else condition.
		
//		if(bookDao.insertBook(book)>0)    /////above command is similar to if else condition
//		{
//			return true;
//		}else
//		{
//			return false;
//		}
		
		
	}
	
}
