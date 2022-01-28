package Test2;

import java.util.Scanner;

public class Ifloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value 1:--> ");
		int a=input.nextInt();
		
		System.out.println("Enter value 2:--> ");
		int b=input.nextInt();
		System.out.println("Enter operation to perform x --> Addition and y --> Subtraction");
		char value=input.next().charAt(0);
if(value == 'x')
{
	int c =a+b;
	System.out.println("Result of Addition is "+c);
	}
else if (value == 'y')
{
	int c =a-b;
	System.out.println("Result of Subtraction is "+c);
}
else {
	System.out.println("NO operation Selected");
}
	}

}
