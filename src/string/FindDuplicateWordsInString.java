package string;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

import problems.checkLeapYear;

public class FindDuplicateWordsInString {
	static char[] ch;
	public static void main(String[] args) {
		String string="One two three four one nine Two seven five one Nine"; 
		String[] string2 = splitFunction(string);
		HashMap<String, Integer> myMap=new HashMap<String, Integer>();
		for(int i=0;i<string2.length;i++) {
			if(myMap.containsKey(string2[i])) {
				myMap.put(string2[i], myMap.get(string2[i])+1);
			}else {
				myMap.put(string2[i], 1);
			}
		}
		
		for (Map.Entry<String, Integer> myEntry:myMap.entrySet()) {
			if (myEntry.getValue()>1) {
				System.out.println(myEntry.getKey()+" is Duplicate");
			}
		}
		
	}
	
	//Function for converting string to char array.
	public static String[] splitFunction(String st) {
		String[] myString=st.toLowerCase().split("\\ ");
		return myString;
	}
}
