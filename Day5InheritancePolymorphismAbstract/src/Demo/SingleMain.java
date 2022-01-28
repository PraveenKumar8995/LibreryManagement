package Demo;

import java.util.Scanner;

public class SingleMain {
	
	public static void main(String[] args) {
		// Main class for single Inheritance
		
		Scanner ch=new Scanner(System.in);
		
//		System.out.println("Enter the value of A ");
//		int a=ch.nextInt();
//		
//		System.out.println("Enter the value of B ");
//		int b=ch.nextInt(); 
		
		System.out.println("Enter Name of student :");
		String name=ch.next();
		
		System.out.println("Enter roll no of student :");
		int rollno=ch.nextInt();
		
		System.out.println("Enter Phone of student :");
		int mobile=ch.nextInt();
		
		System.out.println("Enter City of student :");
		String city=ch.next();
		
		//SingleInheritanceSub ss=new SingleInheritanceSub();
		//ss.addition(a, b);
		//ss.mul(a, b);
		//ss.div(a, b);
		SingleInhertitanceMultilevel sm=new SingleInhertitanceMultilevel();
		//ss.sub(a, b);
		sm.place(city);
		sm.register(rollno);
		sm.details(name);
		sm.phone(mobile);
		sm.display();

	}

}
