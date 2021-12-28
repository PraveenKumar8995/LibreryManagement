package Phone;

import java.util.Scanner;

class Arithmetic {
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the c value");
		int c= sc.nextInt();
		System.out.println("Enter the d value");
		int d=sc.nextInt();
		Operations s=new Operations();
		s.add(c, d);
		s.sub(c, d);
		s.mul(c,d);
		s.div(c, d);
		System.out.println(s.add(c, d));
		System.out.println(s.sub(c, d));
		System.out.println(s.mul(c, d));
		System.out.println(s.div(c, d));
		
	}

}
