package sample;

import java.sql.SQLException;
import java.util.Scanner;

import sample.bean.BooksLib;
import sample.dao.BooksLibDao;

public class BooksLibMain {
	
	BooksLibDao bdo= new BooksLibDao();

	Scanner input=new Scanner(System.in);
	public void bookdetails() throws SQLException
	{
		//BooksLibDao bdo= new BooksLibDao();
		bdo.getBooksDetails();
	}
	public void insertbook() throws SQLException
	{
		BooksLib bookl=new BooksLib();
		
		System.out.println("Enter Book_id");
		int id=input.nextInt();
		bookl.setId(id);
		
		System.out.println("Enter book_name");
		String bname=input.next();
		bookl.setBook_name(bname);
		
		System.out.println("Enter Author name");
		String aname=input.next();
		bookl.setAuthor(aname);
		
		System.out.println("Enter price");
		int price=input.nextInt();
		bookl.setPrice(price);
		
		
		bdo.insertBook(bookl);	
	}
	public void delete() throws SQLException
	{
		BooksLib bl1=new BooksLib();
		
		System.out.println("Enter the book ID to delete ");
		int bk_id=input.nextInt();
		bl1.setId(bk_id);
		bdo.getDeleteBook(bl1);	
	}
	public void updatebook() throws SQLException
	{
		BooksLib bl2=new BooksLib();
		System.out.println("Update opertion");
		System.out.println("Enter the book id");
		int bkid=input.nextInt();
		bl2.setId(bkid);
		
		System.out.println("Enter the new Price to be updated");
		int bprice=input.nextInt();
		bl2.setPrice(bprice);
		
		bdo.updatebooks(bl2);
	}
	public void updatebook1() throws SQLException
	{
		BooksLib bl3=new BooksLib();
		System.out.println("Update opertion");
		System.out.println("Enter the book id");
		int bkid=input.nextInt();
		bl3.setId(bkid);
		
		System.out.println("Enter the new Price to be updated");
		int bprice=input.nextInt();
		bl3.setPrice(bprice);
		
		bdo.changeBook(bl3, null);
	}

	public static void main(String[] args) throws SQLException {
		BooksLibMain blm=new BooksLibMain();
		
		blm.bookdetails();
		blm.updatebook();

	}

}
