package Demo;

import java.util.Scanner;

public class BikeSale {

	String bname;
	float price;
	float tax;
	static float insurence;
	float rto,onroad;
	
	
	public BikeSale(String bname, float price) {
		super();
		this.bname = bname;
		this.price = price;
	}
	
	// Tax is 8%
	public void setTax(float tax) {
		this.tax = tax;
		System.out.println(tax);
		
	}
	
	public float getTax() {
		tax=(8/100)*price;
		
		return tax;
	}

	// Insurance is 12%
	public void setInsurence(float insurence) {
		this.insurence = insurence;
		System.out.println(insurence);
		
	}
	
	public float getInsurence() {
		insurence=(12/100)*price;
		
		return insurence;
	}
// RTO is 5%
	public void setRto(float rto) {
		this.rto = rto;
		System.out.println(rto);
		
		
	}
	
	public float getRto() {
		rto=(5/100)*price;
		
		return rto;
	}
	
	// Getting Onroad Price
	public void setOnroad(float onroad) {
		
		this.onroad = onroad;
		System.out.println(onroad);
		
	}
	
	public float getOnroad() {
		onroad=(price+getTax()+getInsurence()+getRto());
		
		return onroad;
	}
	
	public void display()
	{
	System.out.println(bname+" it's tax"+getTax()+" and its Insruence is "
	+getInsurence()+" and RTO charge is "+getRto()+" So the total onroad price is "+getOnroad());
	}


	public static void main(String[] args) {
		// Sample of Constructor
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Bike name");
		String bname=input.next();
		
		System.out.println("Enter the Price");
		float price=input.nextFloat();
		
		BikeSale bs=new BikeSale(bname, price);
		bs.setTax(price);
		bs.setInsurence(insurence);
		bs.setRto(price);
		bs.setOnroad(price);
		bs.display();
		
	}

}
