package Encapsulation;

public class AccountDetails {
	
	// Private Data members / Variables
	
	private int acc = 12345;
	private int balance;
	private String name;
	
	// getter and setter methods

	//getter method of acc
	public int getAcc() {
		return acc;
	}

	
	public void setAcc(int acc) {
		this.acc = acc;
	}
	
	//setter method for balance
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
