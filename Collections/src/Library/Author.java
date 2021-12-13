package Library;

public class Author {
	String aname;
	String aplace;
	String email;
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	public String getAplace() {
		return aplace;
	}
	public void setAplace(String aplace) {
		this.aplace = aplace;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Author [aname=" + aname + ", aplace=" + aplace + ", email=" + email + "]";
	}
	
	
	

}
