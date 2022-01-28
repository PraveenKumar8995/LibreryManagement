package demo;

public class EmployeeDetails {

	int empid;
	String name;
	String city;
	
	
	public EmployeeDetails(int id,String name,String city) {
		// TODO Auto-generated constructor stub
		this.empid=id;
		this.name=name;
		this.city=city;	
	}


	@Override
	public String toString() {
		return "EmployeeDetails Details is empid - " + empid + ", name=" + name + ", city=" + city +"";
	}


	
	
}
