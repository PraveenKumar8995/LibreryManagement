package javaCollections;

import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentMain {

	public static void main(String[] args) {
		
		Set<StudentDetails> trset=new TreeSet<StudentDetails>();

		
		
		Scanner input=new Scanner(System.in);
		while(true)
		{
			StudentDetails sd=new StudentDetails();
			
		//StudentDetails sd=new StudentDetails();
		
		System.out.println("Enter Student ID ");
		int id=input.nextInt();
		sd.setId(id);
		
		System.out.println("Enter Student Name ");
		String name=input.next();
		sd.setName(name);
		
		System.out.println("Enter Student age ");
		int age=input.nextInt();
		sd.setAge(age);
		
		System.out.println("Enter Students Place");
		String place=input.next();
		sd.setPlace(place);
		
		//System.out.println(sd.toString());
		trset.add(sd);
		
		System.out.println("Do you want to add new values ? (y/n)"); 
		//System.out.println(sd.toString());
		String a=input.next();
		
		if(!a.equalsIgnoreCase("y"))
		{
			//System.out.println(trset);
			break;
		}
		
		}
		System.out.println(trset.toString());

	}

}
