package Loops;

public class NetsedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city = "Hyderabad";
		String Language = "Telugu";
		
		switch (city) {
		
		case "Bangalore":
			System.out.println("Welcome to Bangalore");
			break;
		case "Chennai":
			System.out.println("Welcome to Chennai");
			break;
		case "Hyderabad":
			System.out.println("Welcome to Hyderabad");
			
			switch (Language) {
			case "Telugu":
				System.out.println("Language is Telugu");
				break;
				
			case "Kannada":
				System.out.println("Language is Kannada");
				break;

			default:
				System.out.println("Not Matching");

				break;
			}
			
			
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
