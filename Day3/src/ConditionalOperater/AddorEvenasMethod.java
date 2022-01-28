package ConditionalOperater;

import java.util.Scanner;

public  class AddorEvenasMethod {

	int sum=0;
	static int num,max;
	 int odd()
	{
		System.out.println("You have choose Odd operation");
		for(int i=num;i<=max;i++)
		{
		
		if (i%2 !=0)
	{
	sum=sum+i;	
	
	}
		
		}System.out.println("Sum of Odd no from "+num+ " to " +max+" is "+sum);
		return sum;
	}
	int even()
	{
		System.out.println("You have choose Even operation");
		for(int i=num;i<=max;i++)
		{
		
		if( i %2 ==0) {
			sum=sum+i;
			//System.out.println("Sumof even no from "+num+" to "+max+" is "+sum);
		}
		}
		System.out.println("Sum of Even Number from "+num+ " to " +max+" is "+sum);
		return sum;
	}
	
	public static void main(String[] args) {
		// To execute odd or Even Control Statement for sum of number
		AddorEvenasMethod oe=new AddorEvenasMethod();
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Max Range");
		max=input.nextInt();
		System.out.println("Enter the range to calculate");
		num=input.nextInt();
		
		System.out.println("Choose Add 1 -> even or 2-> ODD");
		int add=input.nextInt();

		if(add == 1) {
			oe.odd();
			
	}else if (add == 2) { 
		oe.even();
		}else {
			System.out.println("Choose A valid Operation");
		}
		//System.out.println("Sum is : "+sum);
		
		
	}

}
