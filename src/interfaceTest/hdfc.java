package interfaceTest;

/*
 * Basically if we implement (use) interface in program, we need to define all the methods in this. 
 * */

public class hdfc implements Interface1,Interface2  {

	public static void main(String[] args) {
		hdfc obj = new hdfc();
		obj.interestRate();

	}

	@Override
	public void interestRate() {
		System.out.println("This is new HDFC rate of interest.");
		
	}

	@Override
	public void updatedRateOfInterest() {
		System.out.println("This is Updated HDFC rate of interest.");
		
	}
	
}
