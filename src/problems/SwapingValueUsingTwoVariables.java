package problems;

public class SwapingValueUsingTwoVariables {

	public static void main(String[] args) {
		// Swaping value using 2 variables
		int a=2,b=5;
		System.out.println("Before swap:a="+a+", b="+b);
		a=b-a;
		b=b-a;
		a=a+b;
		System.out.println("After swap:a="+a+", b="+b);
	}
}
