package com.sample.customer.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.customer.model.Customers;
import com.sample.customer.repo.CustomersRepo;

@Component
public class CustomerDao {
	@Autowired
	CustomersRepo customersRepo;
	
	public List<Customers> getcustomerlist(){
		return customersRepo.findAll();
	}
	public Customers getbyid(Integer cust_id){
		return customersRepo.getById(cust_id);
	}
	public Customers insertcustomer(Customers customer)
	{
		return customersRepo.save(customer);
	}
	public List<String> listCity(){
		return customersRepo.getCity();
	}
	public List<Customers> getbyState(String state)
	{
		return customersRepo.getbyState(state);
		
	}

}
