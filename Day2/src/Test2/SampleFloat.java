package Test2;

import java.util.Scanner;

public class SampleFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		//float f1=input.nextFloat();
		double d1=input.nextDouble();
		
		System.out.println("Enter 2st Number : ");
		float f2=input.nextFloat();
		
		//float f3=f1+f2;
		double d3=d1+f2;
		//System.out.println(f3);
		System.out.println(d3);

	}

}
