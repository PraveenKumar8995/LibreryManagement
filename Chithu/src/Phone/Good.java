package Phone;
import java.util.Scanner;
public class Good {
	
	int a,b,c,d;
		void arith()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a value");
			a = sc.nextInt();
			System.out.println("Enter b value");
			b = sc.nextInt();
			System.out.println("Enter the arithmetic operation to perform");
			c = sc.nextInt();
	switch(c)
	{
	 case 1:
			d= a+b;
			System.out.println("addition result is "+d);
			break;
			
	 case 2:
		 d=a-b;
		 System.out.println("subtraction result is "+d);
		 break;
		 
	 case 3:
		 d=a*b;
		 System.out.println("multiplication result is "+d);
		 break;
		 
	 case 4:
		 d=a/b;
		 System.out.println("division result is "+d);
		 break;
		 
	default:
		System.out.println("Operator is not mentioned");
		return;
			
	}
		}
	public static void main(String[]args)
	{
		Good s=new Good();
		s.arith();
		
	}

	}



