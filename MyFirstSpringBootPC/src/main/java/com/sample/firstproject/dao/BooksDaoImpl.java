package com.sample.firstproject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.sample.firstproject.model.Books;
import com.sample.firstproject.model.BooksMapper;

@Component
public class BooksDaoImpl implements BooksDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate; 
	
	public Books getListOfBooks() {
		
		Books book = jdbcTemplate.queryForObject("select * from books where book_id= 1", new BooksMapper()) ; 
		
		return book;
	}


}
