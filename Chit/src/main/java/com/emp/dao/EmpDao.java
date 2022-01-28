package com.emp.dao;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.emp.bean.Employee;


public class EmpDao {
	
	String hostname="jdbc:mysql://localhost:3306/PROD";
	String user="root";
	String password="123root*";

	Connection con;
public EmpDao()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.con= DriverManager.getConnection(hostname, user, password);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} // Registering driver
	
	}
public List<Employee> getEmplist()
{
	List<Employee> Emplist=new ArrayList<Employee>();
	try {
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery("Select * from Employee");
		
		while(rs.next())
		{
			Employee e =new Employee();
			e.setEid(rs.getInt("empid"));
			e.setEname(rs.getString("name"));
			e.setEsalary(rs.getInt("salary"));
			Emplist.add(e);
		}
		System.out.println(Emplist.toString());
		
	} catch ( SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	return Emplist;
	}


public int insertemployee (Employee emp)
{
	int status=0;
	try {
		PreparedStatement ps=con.prepareStatement("insert into employees(empid,name,salary)values(?,?,?)");
		ps.setInt(1,emp.getEid());
		ps.setString(1,emp.getEname());
		ps.setInt(1,emp.getEsalary());
		
		status=ps.executeUpdate();
		System.out.println("insert status"+status);
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
		return status;
	}
public int deleteemployee (int id)
{
	int status=0;
	try {
		PreparedStatement ps=con.prepareStatement("delete from employee where id=?");
		ps.setInt(1, id);
		status=ps.executeUpdate();
		System.out.println("delete status"+status);
		
	}	
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return status;	
	}
}
