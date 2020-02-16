package string;

public class BreakString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myString="this is the game of code,  and my motive is best code.";
		method1(myString);
		method2(myString);

	}
	
	public static void method1(String s) {
		String[] brokenStrings=s.split("\\s");//Escape sequence for find "space" char
		for(String s2:brokenStrings) {
			System.out.println(s2);
		}
	}
	public static void method2(String s) {
		System.out.println("-------------------");
		
		String[] brokenStrings=s.split("i",5);
		for(String s2:brokenStrings) {
			System.out.println(s2);
		}
	}
}
