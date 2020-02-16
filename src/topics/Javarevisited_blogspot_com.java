package topics;

import custom_helper_functions.HelperFunctions;
import java.util.ArrayList;
import java.util.Scanner;

public class Javarevisited_blogspot_com {

	public static void main(String[] args) {
		System.out.println("Press: 1 for Fibonacci, 2 for PrimeNumber, 3 for Palindrome, 4 for Armstrong");
		int switchInput=HelperFunctions.userIntInput();
		switch (switchInput) {
		case 1:
			Fibonacci();
			break;
		case 2:
			primeNumber();
			break;
		case 3:
			stringPalindrome();
			break;
		case 4:
			armstrongNumber();
			break;
		case 5:
			armstrongNumber();
			break;
		
		default:
			System.out.println("Invalid input!");
			break;
		}
	}
	/*+-------------------------------------------------------------------*/
	public static void Fibonacci() {
		/*
		 * Write a simple Java program which will print Fibonacci series, 
		 * e.g. 1 1 2 3 5 8 13 ... . up to a given number. 
		 * We prepare for cross questions like using iteration over recursion 
		 * and how to optimize the solution using caching and memoization.
		 * */
		int i=HelperFunctions.userIntInput();
		int a=0,b=1,c=0;
		
		do {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+", ");
		}while(c<i);
	}
	/*+-------------------------------------------------------------------*/
	public static void primeNumber() {
		/*
		 * Write a Java program to check if a given number is prime or not. 
		 * Remember, a prime number is a number which is not divisible by any other number, 
		 * e.g. 3, 5, 7, 11, 13, 17, etc. 
		 * Be prepared for cross, e.g. checking till the square root of a number, etc.
		 * */
		int userInput=HelperFunctions.userIntInput();
		System.out.println("Prime numbers are: \n2, 3, 5, 7, 11, ");
		for(int a=2;a<userInput;a++) {
			if(a%2==0) {
			}else if (a%3==0) {
			}else if (a%5==0) {
			}else if (a%7==0) {
			}else if (a%11==0) {
			}else {System.out.print(a+", ");}
		}
	}
	/*+-------------------------------------------------------------------*/
	public static void stringPalindrome() {
		/*
		 * check if a given String is palindrome or not. 
		 * A Palindrome is a String which is equal to the reverse of itself, 
		 * e.g., "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."
		 * */
		Boolean isPalindrome=false;
		String userInputString=HelperFunctions.userStringInput();
		char[] convertedToCharArray=userInputString.toCharArray();
		int i=0;
			for (int j=convertedToCharArray.length-1;j>convertedToCharArray.length/2;j--) {
				if(convertedToCharArray[i]==convertedToCharArray[j]) {
					isPalindrome=true;
				}else {
					isPalindrome=false;
					break;
				}
				i++;
			}
		
		System.out.println("String "+userInputString+" is palindrome: "+ isPalindrome);
	}
	/*+-------------------------------------------------------------------*/
	public static void armstrongNumber() {
		/**
		 * Armstrong number is called an Armstrong number if it is equal to the cube of its every digit.
		 * 153 = 1x1x1+5x5x5+3x3x3 =153
		 * */
		int actual=HelperFunctions.userIntInput(),tmp2,i;
		i=actual;
		ArrayList<Integer> myList=new ArrayList<Integer>();
		while(i>0) {
			tmp2=i%10;
			i=i/10;
			myList.add(tmp2);
		}
		int total=0;
		for (int temp:myList) {
			total=total+(temp*temp*temp);
			}
		if(total==actual) {
			System.out.println("Value is armstrong");
		}else {
			System.out.println("Value is Not armstrong");
		}
	}
	
	
	/*+-------------------------------------------------------------------*/
	
	/*+-------------------------------------------------------------------*/
}