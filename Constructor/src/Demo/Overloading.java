package Demo;

public class Overloading {

	int id;
	String name;
	int age;
	
	
	// This Constructor has all variable initialized
	public Overloading(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	//This Constructor has only 2 variable 
	public Overloading(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	
	@Override
	public String toString() {
		return "Overloading [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

	public static void main(String[] args) {
		// Overloading OPeration
	
		
		Overloading ol2=new Overloading(1, "Chithu", 25);
		Overloading ol3=new Overloading(1, "Ring");
		
		System.out.println(ol2);
		System.out.println(ol3);
		ol2.display();
		ol3.display();

	}

}
