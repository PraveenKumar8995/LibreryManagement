package Test2;

import java.util.Scanner;

public class OperationsSample3 {

	public static void main(String[] args) {
// Check if the number is odd/even

		Scanner input=new Scanner(System.in);
	System.out.println("Enter value:--> ");
	int a=input.nextInt();
	
	if(a%2 ==0)
	{
	System.out.println(a+" is Even Number");
	if (a%3 ==0)
	{
		System.out.println(a+" is also Divisible by 3");
	}
	}
	 else { 
		 System.out.println(a+" is Odd Number");
		 }
	}

}
