package Test2;

public class Sample1 {

	// int c;   // member Variable
	//public void addition(int x,int y)  //arguments
	//{
		//int c=x+y;  //Local Variable
		//result(c);
	//}
	
	public int addition(int x,int y)
	{
		int c=x+y;  //Local Variable
		result(c);
		return c;
	}
	public void result(int c)
	{
		System.out.println("Result is "+c);//concodinate	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 s1 = new Sample1(); //instantation
		s1.addition(10, 15);  //parameters
		s1.addition(20, 45);
		s1.addition(30, 55);
		s1.addition(60, 555);
		
		int c= s1.addition(60, 555);
	}

}
