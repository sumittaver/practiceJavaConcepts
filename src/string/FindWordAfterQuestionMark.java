package string;

import java.util.regex.Pattern;

public class FindWordAfterQuestionMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String perhaString="How are you? Is this fine for you? This is nice place. Are you going movie?";
		String[] st=perhaString.split("\\?");
		for(String st2:st) {
			String st3=st2.trim();
			int i=st3.indexOf(" ");
			System.out.println(st3.substring(0,i));
		}
	}
}