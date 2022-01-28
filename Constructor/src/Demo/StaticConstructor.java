package Demo;

import java.util.Scanner;

public class StaticConstructor {

	int rollno;
	String name;
	static String cname="KCET";
	
	public StaticConstructor(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+cname);
	}

	public static void main(String[] args) {
		// static Variable decleration
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Roll number :");
		int rollno=scr.nextInt();
		
		System.out.println("Enter Name : ");
		String name=scr.next();
		
		
		StaticConstructor sc=new StaticConstructor(rollno, name);
		sc.display();

	}

}
