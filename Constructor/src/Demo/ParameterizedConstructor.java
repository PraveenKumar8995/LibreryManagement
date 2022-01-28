package Demo;

public class ParameterizedConstructor {

	int id;
	String name;
	
	public ParameterizedConstructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor pc=new ParameterizedConstructor(1, "TN");
		ParameterizedConstructor pc1=new ParameterizedConstructor(2, "DL");
		pc.display();
		pc1.display();

	}

}
