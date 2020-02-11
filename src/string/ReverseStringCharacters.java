package string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="HELLO";
		System.out.println("Orignal is:"+string);
		String[] rString;
		char[] ch=string.toCharArray();
		System.out.println("Reverse string is:");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}

}
