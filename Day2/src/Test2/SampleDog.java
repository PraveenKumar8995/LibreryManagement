package Test2;

public class SampleDog {

	int dogage;
	public SampleDog(String name)
	{
		System.out.println("Name of Dog is " +name);
	}
	public void setAge(int age)
	{
		dogage = age;
	}
	public int getAge()
	{
		System.out.println("Age of Dis is "+dogage);
		return dogage;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleDog dog= new SampleDog("Tiger");
		dog.setAge(3);
		dog.getAge();

	}

}
