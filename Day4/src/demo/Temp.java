package demo;

public class Temp {
	int num;
	String name;
	 
	public Temp(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
public void display()
{
System.out.println(num+ "  " +name);	
}
	public static void main(String[] args) {
	
		Temp tp=new Temp(1, "sample");
		Temp t2=new Temp(2,"Chitra");
		tp.display();
		t2.display();
	}
}