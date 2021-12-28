package sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

import sample.bean.BooksLib;

public class BooksLibDao {
	
	String hostname="jdbc:mysql://localhost:3306/PROD";
	String user="root";
	String password="123root*";
	
	Connection con;
	
	public void getBooksDetails() throws SQLException
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // Registering driver
			con= DriverManager.getConnection(hostname,user,password);
			
			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PROD","root","123root*");
			
			Statement st=con.createStatement();
			
			ResultSet rs= st.executeQuery("select * from books");
	
			
			List<BooksLib> bookList=new ArrayList<BooksLib>();
			
			while(rs.next())
			{
				BooksLib bl=new BooksLib();
				bl.setId(rs.getInt("book_id"));
				bl.setBook_name(rs.getString("book_name"));
				bl.setAuthor(rs.getString("author"));
				bl.setPrice(rs.getInt("price"));
				
				bookList.add(bl);
			}
			
			System.out.println(bookList.toString());
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			con.close();
		}
		
		
	}
	
	public void insertBook(BooksLib bkl) throws SQLException
	{
		//BooksLib bkl=new BooksLib();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Registering driver
			con= DriverManager.getConnection(hostname,user,password);
			
			PreparedStatement pr = con.prepareStatement("Insert into books (book_id,book_name,author,price) values (?,?,?,?)");
			pr.setInt(1,bkl.getId());
			pr.setString(2, bkl.getBook_name());
			pr.setString(3, bkl.getAuthor());
			pr.setInt(4, bkl.getPrice());
			
			boolean status=pr.execute();
			
			System.out.println(status);
			
			getBooksDetails();
			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		
		
	}
	
	public void getDeleteBook(BooksLib bkl) throws SQLException
	{
		//BooksLib bkl=new BooksLib();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Registering driver
			con= DriverManager.getConnection(hostname,user,password);
			
			PreparedStatement pr1 = con.prepareStatement("delete from books where book_id=?");
			pr1.setInt(1,bkl.getId());
			
			boolean status=pr1.execute();
			
			System.out.println(status);
			
			getBooksDetails();
			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		
		
	}
	public void updatebooks(BooksLib bk2) throws SQLException
	
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Registering driver
			con= DriverManager.getConnection(hostname,user,password);
			
			PreparedStatement pr2 = con.prepareStatement("update books set price=? where book_id=?");
			
			pr2.setInt(2, bk2.getId());
			pr2.setInt(1, bk2.getPrice());
			
			pr2.execute();
			getBooksDetails();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			con.close();
		}
	}
	
	public void changeBook(BooksLib bk2,String column)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Registering driver
			con= DriverManager.getConnection(hostname,user,password);
			
			String query = "update books set #COLUMN#=? where id=?";
			query = query.replace("#COLUMN#", column);
			
			PreparedStatement ps3 = con.prepareStatement(query);
			
			switch(column)
			{
			case "book_name":
			ps3.setString(1, bk2.getBook_name());
			break;
			
			case "author":
			ps3.setString(1, bk2.getAuthor());
			break;
			
			case "price":
			ps3.setInt(1, bk2.getPrice());
			break;
			
			case "book_id" :
			ps3.setInt(1, bk2.getId());
			break;
			}		
			
			ps3.setInt(2, bk2.getId());
			
			int status=ps3.executeUpdate();
			
			getBooksDetails();
			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
