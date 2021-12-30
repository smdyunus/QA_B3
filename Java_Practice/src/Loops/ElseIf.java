package Loops;

public class ElseIf {

	public static void main(String[] args) {
		
		int age = 18;
		
		if(age>18)  //   18>18 false
		{
				System.out.println("You are eligible");
		
		}
		else if (age<18) //18<18 false 
		{
			System.out.println("You are not eligible");
		}
		
		else
		{
				System.out.println("You are not allowed for vote");
		}
		
	}

}
