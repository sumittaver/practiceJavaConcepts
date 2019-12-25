package string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharInString {

	public static void main(String[] args) {
		String string="This is program, to find duplicate charecter in string is not dificult.";
		 calculateDuplicate(string);
		 findDuplicateCharInString2(string);
		 }
	
	public static void calculateDuplicate(String st) {
		char[] ch=st.toCharArray();
		HashMap<Character, Integer> myHashMap=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++) {
			if (myHashMap.containsKey(ch[i])) {
				myHashMap.put(ch[i], myHashMap.get(ch[i])+1);
			}else {
				myHashMap.put(ch[i], 1);
			}
		}
		
		System.out.println("### Count of Values ###");
		for(Map.Entry<Character, Integer> map2:myHashMap.entrySet()) {
			System.out.println("Charecter "+map2.getKey()+" is "+map2.getValue()+" times");
		}
		System.out.println("### Duplicate Values ###");
		for(Map.Entry<Character, Integer> map2:myHashMap.entrySet()) {
			if(map2.getValue()>1) {
				System.out.println("Charecter "+map2.getKey()+" duplicate");
			}
		}
	}
	
	public static void findDuplicateCharInString2(String str2) {
		  int cnt = 0;
		  char[] inp = str2.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str2.length(); i++) {
		   for (int j = i + 1; j < str2.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.print(inp[j]+" - ");
		     cnt++;
		     break;
		    }
		   }
		  }
	}
}
