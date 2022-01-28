package ConditionalOperater;

import java.util.Scanner;

public class SumofValue {

	public static void main(String[] args) {
		// TO add Sum of 1st 10 Natural Number
		int sum=0,num,max;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Max Range");
		max=input.nextInt();
		System.out.println("Enter the range to calculate");
		num=input.nextInt();
		
		System.out.println("Choose Add 1 -> even or 2-> ODD");
		int add=input.nextInt();
		
		if(add == 1) {
			System.out.println("You have choose Even operation");
			for(int i=num;i<=max;i++)
			{
			
			if( i %2 ==0) {
				sum=sum+i;
				//System.out.println("Sumof even no from "+num+" to "+max+" is "+sum);
			}
			}
			//System.out.println("Sumof even no from "+num+" to "+max+" is "+sum);
			
		}else if (add == 2) { 
			System.out.println("You have choose Odd operation");
			for(int i=num;i<=max;i++)
			{
			
			if (i%2 !=0)
		{
		sum=sum+i;	
		//System.out.println("Sum of even no from "+num+ " to " +max+" is "+sum);
		}
			//System.out.println("Sum of even no from "+num+ " to " +max+" is "+sum);
			}
		}else {
			System.out.println("Choose A valid Operation");
		}
		//System.out.println("Sum is : "+sum);
		
		System.out.println("Sum of Number from "+num+ " to " +max+" is "+sum);
	}
		//System.out.println("Sum of Number from "+num+ " to " +max+" is "+sum);
	

}
