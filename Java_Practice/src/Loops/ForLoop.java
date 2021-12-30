package Loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
		for(init; condition; increment/Decrements)
		{

		}
	*/
		
		for(int i = 0 ; i < 5 ; i++)
		//for( int i = 5 ; i > 0 ; i-- )   // int i = 5, 5>0 ture >> it will execute the Hello
		{								// i-- , 5-1= 4,
										// int i = 4, 4>0 ture >> it will execute the Hello
			System.out.println("Hello"); // i--, 4-1 = 3
										// int i = 3, 3>0 ture >> it will execute the Hello	
										// 	i--, 3-1 = 2		
			
			// int i = 2, 2>0 ture >> it will execute the Hello
			//	i--, 2-1 = 1
			
			// int i = 1, 1>0 ture >> it will execute the Hello
			//	i--, 1-1 = 0
			
			// int i = 0, 0>0 false >> it will stop the execution
		
			}

	}

}
