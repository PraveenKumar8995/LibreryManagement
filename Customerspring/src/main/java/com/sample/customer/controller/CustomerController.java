package com.sample.customer.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.customer.model.Customers;
import com.sample.customer.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService custService;
	
	@GetMapping(value="/customer")
	public List<Customers> getcustomerlist(){
		return custService.getcustomerlist();
	}
	
	@GetMapping(value="/city")
	public Set<String> listcity()
	{
		return custService.listcity();
	}
	
	
    @GetMapping(value="/customer/{cust_id}")
    @ResponseBody
    public Customers getbyid(@PathVariable Integer cust_id)
    {
    	return custService.getbyid(cust_id);
    }
    
    @PostMapping (value="/customer", consumes="application/json", produces= "application/text")
    public ResponseEntity<String> insertcustomer(@RequestBody Customers customer)
    {
    	String status= (custService.insertcustomer(customer)!= null) ? "Success" : "Failed";
    	if (status.equals("Success"))
    	{
    	
    		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
    	}
    	else
    	{
    		return new ResponseEntity<String>(HttpStatus.EXPECTATION_FAILED);
    	}
    }
    
    }

