package Demo;

public class ArrayConstructor {

	String carBrand;
	String model;
	long year;
	float exprice;
	float insurence;
	float onprice;
	int price;
	
	
	public void setcarDetails(String brand,String model,float price)
	{
		this.carBrand=brand;
		this.model=model;
		this.exprice=price;
		 insurence=(5/100*price);
		onprice=(price+insurence);
		
	}


	@Override
	public String toString() {
		return "ArrayConstructor [carBrand=" + carBrand + ", model=" + model + ", year=" + year + ", exprice=" + exprice
				+ ", insurence=" + insurence + ", onprice=" + onprice + "]";
	}


	public void carDetails(String brand, String model2, float exprice2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
