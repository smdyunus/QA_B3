package Strings;

public class JavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// literals   // String Constant pool area
		String s1 = "Hello";
		String s2 = "Hello";	 // it will not create a instance, and it will refer to existing instance
		String s3 = "welcome";
		String s4 = "text";
		
		// String object by new keyword   // Heep area
		String s5 = new String("Google");
		String s6 = new String("Google");
		String s7 = new String("Facebook");		

		System.out.println(s1);
		
		
	}

}
