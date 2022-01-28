package demo;

import java.util.Scanner;

public class ContractEmployee extends Manager{

	String duration;
	public ContractEmployee(long empno, String empname, float salery,String duration) {
//		this.empno = empno;
//		this.empname = empname;
//		this.salery = salery;
		super(empno,empname,salery);
		this .duration=duration;
	}

public void display()
{
	super.display();

	System.out.println(empno+" "+empname+" "+salery+ " "+duration);
}


public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter Emp ID");
	long id=input.nextLong();

	System.out.println("Emp name");
	String name=input.next();

	System.out.println("Emp Salery");
	float amount=input.nextFloat();
	
	System.out.println("Emp Duration");
	String dur=input.next();
	
	
ContractEmployee ce=new ContractEmployee(id, name, amount, dur);
ce.display();

}
}
