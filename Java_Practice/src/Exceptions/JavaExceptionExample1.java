package Exceptions;

public class JavaExceptionExample1 {
	
	public static void main(String[] args) {
		
		System.out.println("Start 1");  
		System.out.println("Start 2");  
	   
	   try {
			int data=100/1;  
				try {
					 //code that may raise exception  
			      	int d=100/0;  

				} catch (Exception e) {
					System.out.println(e);		
				}

	   } catch (Exception e) {
			System.out.println(e);		
	   }
	   
	   //rest code of the program   
	   System.out.println("Start 3");  
	   System.out.println("Start 4");  

	   System.out.println("End");  
	  } 
	
		
	}
