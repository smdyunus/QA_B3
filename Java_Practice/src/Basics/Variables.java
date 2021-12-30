package Basics;

public class Variables {

	//Global - Static and non static	
	int a = 10;   //Global Variable or Class level Variable, Non Static Variable
	// int is a data type
	// a is Variable
	// 10 is a Literal / value
	static int b = 20;  // Global variable or class level and Static Variable
	String s = "Hello";
	
	//Local
	int add() {
		int c = 30;   //local variable
		return c;
	}
	
	public static void main(String[] args) {	
		int d = 10;
		String s1 = "Yunus";
		
		//System.out.println(a);
		System.out.println(b);
		//System.out.println(s);
		//System.out.println(c);

		Variables v = new Variables();
		System.out.println(v.a);
		//System.out.println(b);
		System.out.println(v.s);
		System.out.println(v.add());		
	}	
}
