package Test2;

import java.util.Scanner;

public class Sample2 {

	public int addition(int x,int y)
	{
		int c=x+y;  //Local Variable
		result(c);
		return c;
	}
	public int subtraction(int a,int b)
	{
		int c=b-a;
		result(c);
		return c;
	}
	public void result(int c)
	{
		
		System.out.println("Result is "+c);//concodinate	['
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner readFromFile= new Scanner(System.in);
		System.out.println("Value of A : ");
		int a= readFromFile.nextInt();

		System.out.println("Value of B : ");
		int b= readFromFile.nextInt();
		
		Sample2 s2= new Sample2();
		s2.addition(a,b);
		s2.subtraction(a, b);
	}

}
