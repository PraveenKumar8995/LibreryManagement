package ConditionalOperater;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// Code to Reverse a Number
		
		int remainder;
		int reverse=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number=input.nextInt();
		System.out.println("Entered Value is : "+number);
		while(number !=0) {
		remainder=number%10;
		reverse=reverse*10+remainder;
		number=number/10;
		}
		
		System.out.println("Reverse Number is : "+reverse);
		
		
	}

}
