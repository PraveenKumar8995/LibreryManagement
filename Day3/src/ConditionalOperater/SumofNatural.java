package ConditionalOperater;

import java.util.Scanner;

public class SumofNatural {

	public static void main(String[] args) {
		// TO add Sum of !st 10 Natural Number
		int sum=0,num;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the range to calculate");
		num=input.nextInt();
		for(int i=0;i<=num;i++)
		{
		sum=sum+i;
		//System.out.println("Sum is : "+sum);
		}
		System.out.println("Sum is : "+sum);

	}

}
