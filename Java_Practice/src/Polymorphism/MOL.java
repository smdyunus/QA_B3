package Polymorphism;


public class MOL {
	
	// 2 arguments int int
	int add(int a, int b) {
		return (a+b);	
	}
	
	// 2 arguments int double
	double add(int a, double b) {
		return (a+b);	
	}
	
	// 3 arguments  double int float
	double add(int a, double b, float c) {
		return (a+b+c);	
	}
	
	public static void main(String[] args) {
		int a = 10;
		double b = 5;
		float c = 50.5f;
		double result;
		
		MOL m = new MOL();
		result = m.add(a, b);  // a+b
		System.out.println(result);
		
		result = m.add(a, b, c); //a+b+c   // 10+5+50.5
		System.out.println(result);
		
		result  = m.add(a, b);
		System.out.println(result);



		
	}

}
