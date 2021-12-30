package Basics;

public class Operators {
	
	public static void main(String[] args) {
		
		int x = 200;
		int y = 100;
		int sum1 = x%y; 
		int sum2 = sum1+200;
		int sum3 = sum2+sum1;
		
		// TODO Auto-generated method stub
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

		int a =10;
		int b = ++a;  //10+1 
		int c = --a;  //11-1
		System.out.println(b);
		System.out.println(c);
		
		int a1 = 10;
		a1*=10;  //a1 =a1+10;
		System.out.println("assignment operator: "+ a1);
		
	}

}
