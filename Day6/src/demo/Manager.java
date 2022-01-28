package demo;

import java.util.Scanner;

public class Manager {

	long empno;
	String empname;
	float salery;
	

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Manager(long empno, String empname, float salery) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.salery = salery;
	}
	
	public void display()
	{
		System.out.println(empno+" "+empname+" "+salery);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Emp ID");
		long id=input.nextLong();
	
		System.out.println("Emp name");
		String name=input.next();
	
		System.out.println("Emp Salery");
		float amount=input.nextFloat();
		
		Manager mg=new Manager(id, name, amount);
		mg.display();

	}

}
