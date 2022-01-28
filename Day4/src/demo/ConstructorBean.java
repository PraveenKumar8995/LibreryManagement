package demo;

import java.util.Scanner;

public class ConstructorBean {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EmployeeDetails ED=new EmployeeDetails(1, "Arun","Chennai" );
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Details to be entered ");
		int size=sc.nextInt();
		
		EmployeeDetails[] details=new EmployeeDetails[size];
		
		for (int i=0; i< details.length;i++)
		{
			System.out.println("Enter the Details of Employee "+(i+1));
			
			System.out.println("Enter EMP ID : ");
			int id=sc.nextInt();
			System.out.println("Enter EMP Name : ");
			String name=sc.next();
			System.out.println("Enter EMP City : ");
			String city=sc.next();
			
			EmployeeDetails ed=new EmployeeDetails(id,name,city);
			//System.out.println(ed);
		
			details[i]=ed;
			//System.out.println(details[i]);
			
		}
		
		
		for (EmployeeDetails ed1:details)
		{
			System.out.println("Result : "+ed1);
		}
	}

}
