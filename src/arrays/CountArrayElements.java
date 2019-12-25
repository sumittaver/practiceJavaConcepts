package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountArrayElements {

	public static void main(String[] args) {
		int[] arr= {4,3,6,3,2,6,1,3,3,1,4,3,1};
		Map <Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i=0;i<arr.length;i++) {
				if (map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i])+1);
				}else {
					map.put(arr[i],1);
				}
			//}
		}
		
		for(Map.Entry<Integer,Integer> ent:map.entrySet()){
			System.out.print(ent.getKey()+" : is ");
			System.out.println(ent.getValue()+" times");
		}

	}

}
