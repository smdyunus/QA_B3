package Polymorphism;

public class MOR_C extends MOR{
	
	
	@Override
	public void printData() 
	{
		System.out.println("This is a child class method");
	}
	
	public static void main(String[] args) {
		
		MOR m = new MOR_C();  // child method
		m.printData();

		MOR_C m2 = new MOR_C();  //child
		m2.printData();
		
		
		MOR m1 = new MOR();  //parent method
		m1.printData();
		
	}
	
	
}
