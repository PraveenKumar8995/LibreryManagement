package Test2;

import java.util.Scanner;

public class IFloopMethod {

	private int addition(int a,int b)
	{
		int c=a+b;
		System.out.println("Result of Addition is : "+c);
		return c;
	}
	private int subtraction(int a,int b)
	{
		int c=a-b;
		System.out.println("Result of Subtraction is : "+c);
		return c;
	}
	private int multiplication(int a,int b)
	{
		int c=a*b;
		System.out.println("Result of Multiplication is : "+c);
		return c;
	}
	private int division(int a,int b)
	{
		int c=a/b;
		System.out.println("Result of Division is : "+c);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IFloopMethod f=new IFloopMethod(); ///object creation
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value 1:--> ");
		int a=input.nextInt();
		
		System.out.println("Enter value 2:--> ");
		int b=input.nextInt();
		System.out.println("Choose 1 to perform Addition");
		System.out.println("Choose 2 to perform Subtraction");
		System.out.println("Choose 3 to perform Multiplication");
		System.out.println("Choose 4 to perform Division \n");
		int value = input.nextInt();
		//char value=input.next().charAt(0);
if(value == 1)
{
	int x = f.addition(a,b);
	}
else if(value == 2)
{
	int x = f.subtraction(a,b);
	}

else if(value == 3)
{
	int x = f.multiplication(a,b);
	} 
else if(value == 4)
{
	int x = f.division(a,b);
	}
else{
	System.out.println("NO operation Selected");
}

	}

}
