package com.emp.service;

public class Empservice {
	EmpDao em=new EmpDao();
public List<Employee> getlist()
{
	return em.getEmplist();
}

}
