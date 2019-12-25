package constructorConcept;

public class ConstructorTest {
	int a;// Global variable
	int b;// Global variable

	ConstructorTest() {
		System.out.println("This is default constructor");
	}

	ConstructorTest(int a) {
		this.a = a; // Local variable assigning value in global variable.
		System.out.println("This is perameterised constructor");
	}

	ConstructorTest(int a, int b) {
		this.a = a; // Local variable assigning value in global variable.
		this.b = b; // Local variable assigning value in global variable.
		System.out.println("This is perameterised constructor with two variables");
	}

	void sum() {
		int c = a + b;
		System.out.println("Sum of the values=" + c);
	}
	/* *
	 * We always create object of the constructor (Not Class).
	 * Every object have there separate copy of variables.
	 * */
	public static void main(String[] args) {
		ConstructorTest obj = new ConstructorTest();
		obj.sum();
		ConstructorTest obj2 = new ConstructorTest(10);
		obj2.sum();
		ConstructorTest obj3 = new ConstructorTest(10, 5);
		obj3.sum();
	}

}
