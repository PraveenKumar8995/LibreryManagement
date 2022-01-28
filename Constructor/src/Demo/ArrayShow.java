package Demo;

import java.util.Scanner;

public class ArrayShow {

	public static void main(String[] args)
	{
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the no of cars");
		int size=input.nextInt();
		ArrayConstructor[] cars=new ArrayConstructor[size];
		
		for (int i=0;i<cars.length;i++)
		{
			
		System.out.println("Enter the car Brand");
		String brand=input.next();
		
		System.out.println("Select Model ");
		String model=input.next();
		
		System.out.println("Enter the Ex-Showroom price ");
		float price=input.nextFloat();
		
		ArrayConstructor ac=new ArrayConstructor();
		ac.carDetails(brand,model,price);
		cars[i]=ac;
		
		System.out.println(cars[i]);
		
		
		}
		
		
	}
}
