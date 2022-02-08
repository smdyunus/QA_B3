package Encapsulation;

public class TestAccountDetails {

	
	public static void main(String[] args) {
		
		AccountDetails a = new AccountDetails();
		a.setBalance(1000);
		a.setName("Yunus");
		//a.setAcc(787678);
		
		System.out.println("Account number "+ a.getAcc());
		System.out.println("Name "+ a.getName());
		System.out.println("Balance "+ a.getBalance());
		
	}

}
