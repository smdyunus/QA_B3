package Abstraction;

public class ChildTestInterface implements Interface1, Interface2{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Test Interface");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Test Stop Method");
		
	}
	
	public static void main(String[] args) {
		
		ChildTestInterface c = new  ChildTestInterface();
		c.run();
		c.stop();
		
	}



		
}
