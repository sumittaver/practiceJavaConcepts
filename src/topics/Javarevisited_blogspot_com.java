package topics;

import java.util.Scanner;

public class Javarevisited_blogspot_com {

	public static void main(String[] args) {
		Fibonacci();
		
	}
	

	public static void Fibonacci() {
		/*
		 * Write a simple Java program which will print Fibonacci series, 
		 * e.g. 1 1 2 3 5 8 13 ... . up to a given number. 
		 * We prepare for cross questions like using iteration over recursion 
		 * and how to optimize the solution using caching and memoization.
		 * */
		int i=HelpingFunctions.userIntInput();
		int a=0,b=1,c=0;
		
		do {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+", ");
		}while(c<i);
		
	}

}


class HelpingFunctions{
	static Scanner myScanner=new Scanner(System.in);
	public static String userStringInput() {
		String str=myScanner.nextLine();
		return str;
	}
	public static int userIntInput() {
		int int_input=myScanner.nextInt();
		return int_input;
	}
	public void userCharacterInput() {
		
	}	
}