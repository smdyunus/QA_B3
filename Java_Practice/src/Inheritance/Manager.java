package Inheritance;

public class Manager extends Employee{
	
	 int bonus=10000;  
	 static int pension =20000;  

	 public static void main(String[] args) {
		Manager m = new Manager();
		
		System.out.println(m.bonus);
		System.out.println(m.salary);
		System.out.println(pension);
		 
	}
	 
	 
}
