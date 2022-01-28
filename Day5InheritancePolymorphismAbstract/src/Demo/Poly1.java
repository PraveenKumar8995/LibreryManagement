package Demo;

public class Poly1 {

	float price;
	String bank;
	public float getRateofIntrest(float a) 
	{
		price=a/30;
		return price;
	}
	
	public void bankName()
	{
		System.out.println("BANK name is ICICI");
	}
	
	public void display()
	{
		System.out.println(price);
	}
}
