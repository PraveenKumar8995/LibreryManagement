package com.sample.firstproject.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sample.firstproject.model.Books;

@Repository
public interface BooksRepo extends JpaRepository<Books,Integer> {

	@Query("select b.author from Books b")
	public List<String> getAuthors();
	
	
}