package string;

import custom_helper_functions.HelperFunctions;

public class ReverseStringCharacters {

	public static void main(String[] args) {
		String string=HelperFunctions.userStringInput();
		System.out.println("Orignal is:"+string);
		char[] ch=string.toCharArray();
		System.out.println("Reverse string is:");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		System.out.println("\nReverse words are:");
		String[] breakString=string.split(" ");
		for (int i = breakString.length-1; i >= 0; i--) {
			System.out.print(breakString[i]+" ");
		}
		
	}
}
