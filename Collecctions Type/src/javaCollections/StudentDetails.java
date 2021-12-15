package javaCollections;

public class StudentDetails implements Comparable<StudentDetails> {
	
	private int id;
	private String name;
	private int age;
	private String place;

	public StudentDetails() {
		super();
	}

	public StudentDetails(int id, String name, int age, String place) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.place = place;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", age=" + age + ", place=" + place + "]";
	}

	@Override
	public int compareTo(StudentDetails o) {
		// TODO Auto-generated method stub
		return (this.id-o.id);
	}
	
	

}
