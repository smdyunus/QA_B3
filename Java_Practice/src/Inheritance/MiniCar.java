package Inheritance;

public class MiniCar extends Car{
	
	public void suv() {
		System.out.println("suv");
	}
	
	// Prop of own + Car(Car + Vehicle prop)
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniCar mc = new MiniCar();
		mc.suv();
		mc.color();
		mc.engine();
		mc.milage();

	}

}
