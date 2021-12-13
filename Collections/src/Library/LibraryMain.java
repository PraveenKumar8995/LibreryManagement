package Library;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LibraryMain {

	Scanner input = new Scanner(System.in);	

	Map<Integer,Book> libBook=new HashMap<Integer,Book>();
	
	public void insert()
	{
		while(true)
		{
			Book bk=new Book();
			Author au=new Author();
			 
			System.out.println("Enter Book ID");
			int bookid=input.nextInt();
			bk.setBid(bookid);
			
			System.out.println("Enter Name of Book");
			String bookname=input.next();
			bk.setBname(bookname);
			
			System.out.println("Enter the Price");
			float pr=input.nextFloat();
			bk.setPrice(pr);
			
			System.out.println("Enter Author name");
			String authname=input.next();
			au.setAname(authname);
					
			System.out.println("Enter Author Place ");
			String authplace=input.next();
			au.setAplace(authplace);
			
			System.out.println("Enter Author E-mail ");
			String authemail=input.next();
			au.setEmail(authemail);
			
			bk.setAuthor(au);
			
			libBook.put(bookid,bk);
			
			System.out.println("Do you want to add more Books ? (y/n) ");
			String status=input.next();
			
			
			if(!status.equalsIgnoreCase("y"))
				
				{
					break;
				}
				
				
				//libBook.put(bookid,bk);
			}
				
		
		System.out.println(libBook.toString());

		
	}
	
	public void update()
	{
		System.out.println("Enter the Book Id to be updated");
		int newId=input.nextInt();
		
		System.out.println(libBook.get(newId));
		
		Book newbkid=libBook.get(newId);
		Author ar=new Author();
           
		System.out.println("Enter the value to change "+newbkid);
		
	String newvalue=input.next();
	
	switch(newvalue)
	{
	case "bid":
	System.out.println("Enter the Updated ID value");
	int nid=input.nextInt();
	newbkid.setBid(nid);
	break;
	
	case "bname":
	System.out.println("Enter the New Book Name");
	String nname=input.next();
	newbkid.setBname(nname);
	break;
	
	case "aname":
	System.out.println("Updated Author name");
	String atname=input.next();
	ar.setAname(atname);
	break;
	
	case "acity":
	System.out.println("Enter the Author's New City");
	String atcity=input.next();
	ar.setAplace(atcity);
	break;
	
	case "email":
	System.out.println("Enter Update email ID ");
	String athmail=input.next();
	ar.setEmail(athmail);
	break;
	
	case "price":
	System.out.println("Enter the new Price ");
	break;
	
	default:
	System.out.println("Enter the valid value");
	}
	newbkid.setAuthor(ar);
	System.out.println("New value is : "+newbkid);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		Map<Integer,Book> libBook=new HashMap<Integer,Book>();
		
		
		Scanner input = new Scanner(System.in);
		LibraryMain lm=new LibraryMain();
		lm.insert();
		lm.update();
		
		
		
			
	}

}
