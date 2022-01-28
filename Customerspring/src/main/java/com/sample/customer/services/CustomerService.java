package com.sample.customer.services;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.customer.Dao.CustomerDao;
import com.sample.customer.model.Customers;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	
	public List<Customers> getcustomerlist(){
		return customerDao.getcustomerlist();
	}
	public Customers getbyid(Integer cust_id){
		return customerDao.getbyid(cust_id);
	}
	public Customers insertcustomer(Customers customer)
	{
		return customerDao.insertcustomer(customer);
	}
	public Set<String> listcity()
	{
		Set<String> cityset=new TreeSet<String>();
		cityset.addAll(customerDao.listCity());
		return cityset;
	}
	public List<Customers> getbyState(String state){
		return customerDao.getbyState(state);
	}
}
