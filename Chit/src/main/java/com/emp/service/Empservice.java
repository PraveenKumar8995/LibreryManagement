package com.emp.service;

import java.util.List;

import com.emp.bean.Employee;
import com.emp.dao.EmpDao;

public class Empservice {
	EmpDao em=new EmpDao();
public List<Employee> getlist()
{
	return em.getEmplist();
}
public boolean insertemp(Employee empl)
{
	empl.setEid((int)((Math.random()*(100-20))+20));
	return (em.insertemployee(empl)>0)?true:false;
	
}
public boolean deleteemp(int id)
{
	return (em.deleteemployee(id)>0)?true:false;
}
}
