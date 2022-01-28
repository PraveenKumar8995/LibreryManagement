package ConditionalOperater;

import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {
		// Array Basic Command
		int i,sum=0,avg = 0;
		int [] mark=new int[4];
		Scanner value=new Scanner(System.in);
		//System.out.println("Enter the marks : ");
		
		for ( i=0;i<mark.length;i++)
		{
			System.out.println("Enter Mark of "+i+ " st Subject");
			mark[i]=value.nextInt();
			sum = sum+mark[i];
			
			//System.out.println("Mark is :"+mark[i]);
			
		}
		System.out.println("Mark is :"+sum);
		avg=sum/mark.length;
		System.out.println("Average of Mark is :"+avg);
		
	}

}
