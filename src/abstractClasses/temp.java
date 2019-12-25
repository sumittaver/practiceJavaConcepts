package abstractClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class temp {

	static void p(Object s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create map to store
        Map<String, List<String>> map = new HashMap<String, List<String>>();
		
        Map<Integer,Map<String,String>> mvalues=new HashMap<Integer,Map<String,String>>();
        
        Map<String,String> d =new HashMap<String,String>();
        	d.put("id", "123");
        	d.put("title", "dummy title");
        	mvalues.put(new Integer(0), d);
        	System.out.println("test:1"+mvalues.toString());
        	
        	d =new HashMap<String,String>();
         	d.put("id", "124");
         	d.put("title", "title 124");
         	mvalues.put(new Integer(1), d);
         	System.out.println("test:2"+mvalues.toString());
         	
         	 d =new HashMap<String,String>();
         	d.put("id", "125");
         	d.put("title", "dummy title 125");
         	mvalues.put(new Integer(2), d);
         	System.out.println("test:3"+mvalues.toString());
         	
         	 d =new HashMap<String,String>();
         	d.put("id", "126");
         	d.put("title", "126 dummy title");
         	mvalues.put(new Integer(3), d);
         	System.out.println("test:4"+mvalues.toString());
         	
        for (Map.Entry<Integer,Map<String,String>> entry : mvalues.entrySet()){
        	Integer key = entry.getKey();
        	Map<String,String> str = entry.getValue();
        	System.out.println("***Test***");
         	System.out.println(key);
         	System.out.println(str);
         	System.out.println("***End***");
        }
        	
        	
        p(	mvalues.get(new Integer(3)).get("id"));
        // create list one and store values
        List<String> valSetOne = new ArrayList<String>();
        valSetOne.add("Apple");
        valSetOne.add("Aeroplane");
        // create list two and store values
        List<String> valSetTwo = new ArrayList<String>();
        valSetTwo.add("Bat");
        valSetTwo.add("Banana");
        // create list three and store values
        List<String> valSetThree = new ArrayList<String>();
        valSetThree.add("Cat");
        valSetThree.add("Car");
        // put values into map
        map.put("A", valSetOne);
        map.put("B", valSetTwo);
        map.put("C", valSetThree);
        // iterate and display values
        System.out.println("Fetching Keys and corresponding [Multiple] Values n");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "n");
            System.out.println("Test:"+entry.getValue().get(0));
        }

	}

}
