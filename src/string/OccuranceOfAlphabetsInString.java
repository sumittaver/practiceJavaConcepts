package string;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class OccuranceOfAlphabetsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="giwegriuwehoj pqeqwe qwq whrqsfsdki";
		char[] ch=st.toCharArray();
		HashMap<Character,Integer> myHashMap = new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++) {
			if (myHashMap.containsKey(ch[i])) {
				int ij=myHashMap.get(ch[i]);			
				ij=ij+1;
				myHashMap.put(ch[i], ij);
			}
			else {
				myHashMap.put(ch[i],1);
			}
		}
		for (Map.Entry entry:myHashMap.entrySet()) {
			System.out.println("Value: "+entry.getKey()+": Count is:"+entry.getValue());
		}
	}

}
