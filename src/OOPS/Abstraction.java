package OOPS;

import java.util.Scanner;

/*TODO Auto-generated method stub
Abstraction is concept where provide only necessary information and hide rest of the information.
Abstract class can have abstract and concrete methods
We cant create object for abstract class
Using the keyword abstract we can create abstract class*/

interface in1{
	int i=10;
	public int m1(int x);
}
interface in2{
	void addition(int a, int b);
}

public class Abstraction implements in1,in2{
		@Override
		public int m1(int x) {
			// TODO Auto-generated method stub
			int i=x*x;
			return i;
		}
		public void addition(int a, int b) {
			int c=a+b;
			System.out.println("Add is: "+c);
		}
		public static void main (String[] args) {
			Abstraction abstraction=new Abstraction();
			Scanner scanner=new Scanner(System.in);
			int i=scanner.nextInt();
			System.out.println("Pow is: "+abstraction.m1(i));
			abstraction.addition(2, 5);
		}
}