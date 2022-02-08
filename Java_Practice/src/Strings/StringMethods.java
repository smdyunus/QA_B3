package Strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1 = "Yunus";
		String s2 = "Shaik";
		String s3 = "Yunus";
		String s5 = new String("Yunus");
		String s6 = "Shaik Mohammed Yunus";
		String s8 = " INDIA ";
		
		String s4 = s3.concat(" SMD");   //Yunus SMD
		System.out.println(s4);
		System.out.println("Length of String is: "+ s4.length());

		System.out.println(s1.equals(s5)); // it will compare the content of the object
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s5);  //it will compare the address of the object
		
		System.out.println("Comparision: "+ s1.compareTo(s3));
	
		//Split text
		String [] arr = s6.split(" ");
		for (String string : arr) {
			System.out.println(string);
		}
		
		char ch = s1.charAt(2);
		System.out.println(ch);
		
		String replace = s2.replace("Shaik", "John");
		System.out.println(replace);

		System.out.println(s8.trim());
		
		System.out.println(s1.startsWith("Y"));
		System.out.println(s1.endsWith("s"));
		
		System.out.println(s8.toLowerCase());
		System.out.println(s1.toUpperCase());		
		
		// String reverse by using StringBuilder
		String s10 = "welcome"; //emoclew
		StringBuilder sb = new StringBuilder();
		sb.append(s10);
		System.out.println(sb.reverse());
	
		// String reverse by using StringBuffer
		StringBuffer b = new StringBuffer(s10);
		System.out.println(b.reverse());

	}
}
