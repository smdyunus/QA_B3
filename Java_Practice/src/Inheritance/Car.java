package Inheritance;

public class Car extends Vehicle{

	public void milage() {
		System.out.println("Milage Check");
	}
	
	// Child will have his own(milage) and parent Propengine, color()
	// 3 = 1+2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.color();
		c.engine();
		c.milage();
		
	}

}
