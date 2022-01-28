package com.sample.customer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.customer.model.Customers;

@Repository
public interface CustomersRepo extends JpaRepository<Customers, Integer> {

	@Query("select c.city from Customers c")
	public List<String> getCity();
	
	@Query("select customer from Customers customer where customer.state = stat")
	public List<Customers> getbyState(@Param(value="stat")String state);
	
}
