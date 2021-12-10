package sample.com;

import java.util.Scanner;

public class LibreryMain {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the number of books to be ENROLLED : ");
		int size=input.nextInt();
		
		Book[] book=new Book[size];
		
		
		for (int i=0;i<book.length;i++)
		{
			Book bk=new Book();
			
			System.out.println("Enter the book id");
			int id=input.nextInt();
			bk.setId(id);
			
			System.out.println("Enter the book name : ");
			String bkname=input.next();
			bk.setBook(bkname);
			
			System.out.println("Enter the book price : ");
			float price=input.nextFloat();
			bk.setPrice(price);
			
			Author au=new Author();
			
			System.out.println("Enter the Author id : ");
			int authid=input.nextInt();
			au.setId(authid);
			
			System.out.println("Enter the Author name : ");
			String authname=input.next();
			au.setName(authname);
			
			System.out.println("Enter the Author city : ");
			String city=input.next();
			au.setCity(city);
			
			System.out.println("Enter the Author email : ");
			String email=input.next();
			au.setEmail(email);
			//author[i]=au;
			
			//System.out.println(author[i]);
			
			//bk.setAuthor(author[i]);
			bk.setAuthor(au);
		
			
			book[i]=bk;
			System.out.println(book[i]);
			
			
		}

	}

}
