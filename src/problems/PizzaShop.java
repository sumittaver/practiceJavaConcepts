package problems;

import java.io.IOException;
import java.util.Scanner;

import string.sortinginarray;

public class PizzaShop {

	public static void main(String[] args) throws IOException {
		// Create a pizza shop where user can order pizza in 80,100,120 Rs.
		// and toping in 40,50,60 Rs., combination can be any.
		//Ex. 80 Rs. pizza with 40,50 Rs. toping.
		
		System.out.println("Choose pizza, press: |1 for 80Rs.|2 for 100Rs.|3 for 120Rs.");
		int input;
		Scanner sc=new Scanner(System.in);
		input=sc.nextInt();
		int total=0,toping=0;
		char a;
		do {
			if (input==1) {
				total=total+80;
				System.out.println("Pizza base price: "+total);
				
				System.out.println("Please Choose toping,  press: |1 for 40Rs.|2 for 50Rs.|3 for 60Rs.");
				toping=sc.nextInt();
				if(toping==1) {
					System.out.println("Toping price: 40Rs");
					System.out.println("Total is: "+total+40);
				}else if(toping==2) {
					System.out.println("Toping price: 50Rs");
					System.out.println("Total is: "+total+50);
				}else if(toping==3) {
					System.out.println("Toping price: 60Rs");
					System.out.println("Total is: "+total+60);
				}		
			}else if(input==2) {
				total=total+100;
				System.out.println("Pizza base price: "+total);
				System.out.println("Please Choose toping,  press: |1 for 40Rs.|2 for 50Rs.|3 for 60Rs.");
				toping=sc.nextInt();
				if(toping==1) {
					System.out.println("Toping price: 40Rs");
					System.out.println("Total is: "+total+40);
				}else if(toping==2) {
					System.out.println("Toping price: 50Rs");
					System.out.println("Total is: "+total+50);
				}else if(toping==3) {
					System.out.println("Toping price: 60Rs");
					System.out.println("Total is: "+total+60);
				}	
			}else if(input==3) {
				total=total+120;
				System.out.println("Pizza base price: "+total);
				System.out.println("Please Choose toping,  press: |1 for 40Rs.|2 for 50Rs.|3 for 60Rs.");
				toping=sc.nextInt();
				if(toping==1) {
					System.out.println("Toping price: 40Rs");
					System.out.println("Total is: "+total+40);
				}else if(toping==2) {
					System.out.println("Toping price: 50Rs");
					System.out.println("Total is: "+total+50);
				}else if(toping==3) {
					System.out.println("Toping price: 60Rs");
					System.out.println("Total is: "+total+60);
				}	
			}else if(input!=1&&input!=2&&input!=3) {
				System.out.println("Invalid input");
			}
			System.out.println("Press 'y' if you want to add more pizza else press 'n'");
			a=(char) System.in.read();
		}while(a=='y');
		
		
		
//		
//		
//		
//		
//		switch (input) {
//		case 1:
//			total=total+80;
//			System.out.println("Please Choose toping,  press: |a for 40Rs.|b for 50Rs.|c for 60Rs.");
//			//Scanner sc2=new Scanner(System.in);
//			char toping=(char)System.in.read();
//			switch (toping) {
//			case 'a':
//				total=total+40;
//				System.out.println("Added 40Rs. toping, total is: "+total);
//				break;
//			case 'b':
//				total=total+50;
//				System.out.println("Added 40Rs. toping, total is: "+total);
//				break;
//			case 'c':
//				total=total+60;
//				System.out.println("Added 40Rs. toping, total is: "+total);
//				break;
//
//			default:
//				System.out.println("Invalid entry!");
//				break;
//			}
//			
//			break;
//		case 2:
//			total=total+100;
//			System.out.println("Please Choose toping,  press: |a for 40Rs.|b for 50Rs.|c for 60Rs.");
//			//Scanner sc2=new Scanner(System.in);
//			char toping2=(char)System.in.read();
//			switch (toping2) {
//			case 'a':
//				total=total+40;
//				System.out.println("Added 40Rs. toping, total is: "+total);
//				break;
//			case 'b':
//				total=total+50;
//				System.out.println("Added 40Rs. toping, total is: "+total);
//				break;
//			case 'c':
//				total=total+60;
//				System.out.println("Added 40Rs. toping, total is: "+total);
//				break;
//
//			default:
//				System.out.println("Invalid entry!");
//				break;
//			}
//			break;
//			
//		case 3:
//			total=total+120;
//			System.out.println("Please Choose toping,  press: |a for 40Rs.|b for 50Rs.|c for 60Rs.");
//			//Scanner sc2=new Scanner(System.in);
//			char toping3=(char)System.in.read();
//			switch (toping3) {
//			case 'a':
//				total=total+40;
//				System.out.println("Added 40Rs. toping, total is: "+total);
//				break;
//			case 'b':
//				total=total+50;
//				System.out.println("Added 40Rs. toping, total is: "+total);
//				break;
//			case 'c':
//				total=total+60;
//				System.out.println("Added 40Rs. toping, total is: "+total);
//				break;
//
//			default:
//				System.out.println("Invalid entry!");
//				break;
//			}
//			break;
//		default:
//			System.out.println("Invalid input");
//			break;
//		}

	}

}
