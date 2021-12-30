package Basics;

public class dummy {
	
	//Non static method
	void login() {
		System.out.println("Login Successfull");
	}
	
	//Non static
	int addition()
	{
		int a = 10;
		int b = 10;
		int c = a+b;
		return c;
		
	}
	
	//static method
	static	void registration() {
			System.out.println("registration Successfull");
	}
	
	static String userName()
	
	{
		String s = "Hello";
		return s;
		
	}
	
	public static void main(String[] args) {
		registration();
		System.out.println(userName());
		
		dummy a = new dummy();
		int ad = a.addition();
			
		a.login();
		System.out.println(ad);
		
	}

}
