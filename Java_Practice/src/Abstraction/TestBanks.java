package Abstraction;

public class TestBanks {
	
	public static void main(String[] args) {
		
		HDFC t = new HDFC();
		System.out.println(t.getRateOfIntereset());
		
		PNB p = new PNB();
		System.out.println(p.getRateOfIntereset());
	}

}
