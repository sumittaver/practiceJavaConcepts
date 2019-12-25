package string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is good program";
		Map <Character,Integer> mp = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (int i=0;i<ch.length;i++) {
			for (int j=1;j<ch.length;j++) {
				if (ch[i]==ch[j]) {
					mp.put(ch[i], 1);
				}
			}
		}

	}

}
