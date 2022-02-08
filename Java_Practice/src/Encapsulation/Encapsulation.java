package Encapsulation;

public class Encapsulation {

	// Private members
	
	private String name;	
	private int mobile;
	private int age = 20;
	
	public int getAge() {
		return age;
	}
	
	
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	
	// methods(getter and setter)
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
