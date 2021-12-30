package Loops;

public class NestedIfElse {

	public static void main(String[] args) {

		int age = 2;		
		if(age>18) // 2>18 false
		{
				System.out.println("You are eligible");
		 
				if(age>60)
				{
						System.out.println("You are senior citizen");
				 
				}
				else
				{
						System.out.println("You are not a sc");
				}
		}
		else
		{
				System.out.println("You are not eligible");
		}
		
	}

}
