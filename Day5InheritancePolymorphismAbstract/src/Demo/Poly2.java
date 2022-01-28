package Demo;

import java.util.Scanner;

public class Poly2 extends Poly3 {

	public float getRateofIntrest(float a) 
	{
		price=a/20;
		return price;
	}
	
	public static void main(String[] args) {
		Poly2 p2=new Poly2();
		Poly1 p1=new Poly1();
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Price : ");
		float price=input.nextFloat();
		
//		p2.getRateofIntrest(price);
//		p1.getRateofIntrest(price);
//		p2.display();
//		p1.display();
//		
	p2.bankName();
		
		
	
	}
}
