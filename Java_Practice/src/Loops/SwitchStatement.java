package Loops;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city = "Mysore";
		
		switch (city) {
		
		case "Bangalore":
			System.out.println("Welcome to Bangalore");
			break;
		case "Chennai":
			System.out.println("Welcome to Chennai");
			break;
		case "Hyderabad":
			System.out.println("Welcome to Hyderabad");
			break;
		case "Mysore":
			System.out.println("Welcome to Mysore");
			break;

		default:
			System.out.println("City Not Found");
			break;
		}
		

	}

}
