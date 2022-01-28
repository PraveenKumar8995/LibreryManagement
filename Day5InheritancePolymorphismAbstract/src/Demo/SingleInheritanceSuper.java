package Demo;

public class SingleInheritanceSuper {

	int c;
	int rollno;
	int mobile;
	String name,city;
	
	public int addition(int a,int b)
	{
		 c=a+b;
		return c;
	}
	public int sub(int a,int b)
	{
		c=a-b;
		return c;
	}
	
//	public void display01()
//	{
//		System.out.println("Result is "+c);
//	}
	
	public String details(String name)
	{
		this.name=name;
		return name;
	}
	public void display()
	{
		System.out.println("Name of the student is "+name+" with emp id "+rollno+" with his phone no "+mobile+" and is from city "+city);
	}

	
}
