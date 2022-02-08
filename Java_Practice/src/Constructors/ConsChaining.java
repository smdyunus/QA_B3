package Constructors;

public class ConsChaining {
	
	public ConsChaining() {
		this("hello"); // Go for String related Cons
		System.out.println("This is a No Argumenrt Cons");
	}
	
	public ConsChaining(String name) {
		this(10); // Go for int related Cons
		System.out.println("This is a String Argumenrt Cons");	}

	ConsChaining(int a){
		System.out.println("This is int Argument Cons");
	}
	
	public static void main(String[] args) {
		ConsChaining c = new ConsChaining();
		
	}

}
