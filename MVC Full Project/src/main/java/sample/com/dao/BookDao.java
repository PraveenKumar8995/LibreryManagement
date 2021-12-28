package sample.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sample.com.Model.*;

public class BookDao {

	String hostName = "jdbc:mysql://localhost:3306/javatraining"; 
	String user= "root";
	String password= "root1234";

	Connection con;
	
	public BookDao()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.con = DriverManager.getConnection(hostName, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Registering driver
		
	}
	
	
	
	
	public List<Books> getBooksList()
	{
		List<Books> bookList = new ArrayList<Books>();
		
		try {
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from books");
			
			
			while(rs.next())
			{
				Books book = new Books();
				book.setId(rs.getInt("id"));
				book.setBookName(rs.getString("book_name"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getInt("price"));
				
				bookList.add(book);
				
			}
			
			System.out.println(bookList.toString());
			
		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
		
		return bookList;
}
}
