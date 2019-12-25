package interfaceTest;

public class SBI implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI obj = new SBI();
		obj.interestRate();
	}

	@Override
	public void interestRate() {
		// TODO Auto-generated method stub
		System.out.println("This is SBI interest rate.");
		
	}

}
