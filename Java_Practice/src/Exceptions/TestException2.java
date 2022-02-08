package Exceptions;

public class TestException2 {

	static void ValidateAge(int age) throws Exception  
	{
		if(age>18)
		{
			System.out.println("Eligible for Vote");
		}
		else {
			System.out.println("Not Eligible for Vote");
			throw new Exception();

		}
		
		System.out.println("Voted Successfully");	
	}
	
	public static void main(String[] args) throws Exception  {
		
		ValidateAge(12);		
	}
	
	
}
