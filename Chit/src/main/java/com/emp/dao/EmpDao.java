package com.emp.dao;
import java.util.String;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.emp.bean.Employee;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class EmpDao {
	String hostName = "jdbc:mysql://localhost:3306/javatraining"; 
	String user= "root";
	String password= "root1234";

	Connection con;
public EmpDao()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.con= DriverManager.getConnection(hostName, user, password);
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
}


