package com.emp.bean;

import java.util.String;
public class Employee {
	
	private int empid;
	private String name;
	private int salary;
public Employee()
{}
public Employee(int empid,String name,int salary)
{
	super();
	this.empid=empid;
	this.name=name;
	this.salary=salary;
}

public int getEid()
{
	return empid;
	
}
public void setEid(int empid)
{
	this.empid=empid;
}
public String getEname()
{
	return name;
	
}
public void setEname(String name)
{
	this.name=name;
}
public int getEsalary()
{
	return salary;
	
}
public void setEsalary(int salary)
{
	this.salary=salary;
}
public String toString() {
	return "Employee [id=" + empid + ", Name=" + name +  ", salary=" + salary + "]";
}
}
