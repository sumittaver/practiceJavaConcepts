package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) throws NullPointerException{
		/*
		 * Map Interface is having Classes: HashMap, LinkedHashMap and TreeMap
		 * Map is use key and value format
		 * Map Interface is work almost as Set interface but it not support key value format
		 * Map can not preserve insertion order
		 * */
		System.out.println("==================== HashMap ====================");
		/*
		 * HashMap can't have duplicate key
		 * One null key and multiple null values are allowed
		 * HashMap can't preserve insertion order
		 * HashMap is non-synchronized that is why multiple threads can access same resource
		 * In another words it is not provide thread safety
		 * */
		HashMap<String,Student> myMap=new HashMap<String,Student>();
		Student s1=new Student(01, "Rahul", "Delhi", 28);
		Student s2=new Student(02, "Avinash", "Ghaziabad", 29);
		Student s3=new Student(03, "Rohit", "Agra", 26);
		Student s4=new Student(04, "Sheela", "UP", 25);
		Student s5=new Student(04, "Ashok", "UP", 25);//Duplicate key
		Student s6=new Student(05, "Mahesh", "Jammu", 52);
		myMap.put("001", s1);
		myMap.put("002", s2);
		myMap.put("003", s3);
		myMap.put("004", s4);
		myMap.put("004", s5);//Updating values on existing key
		myMap.put(null, s5);//Adding null key
		//myMap.put("005", null);//Adding null value
		myMap.put(null, s5);//Adding 2nd null key
		
		for(Map.Entry myEntry:myMap.entrySet()) {
			System.out.println("\nStudent Rollnumber:"+myEntry.getKey());
			Student myStudent=(Student) myEntry.getValue();
			System.out.print("Name:"+myStudent.nameOfStudent+", City:"+myStudent.city+", Age:"+myStudent.age);
		}
		System.out.println("\n------Second HashMap---------");
		HashMap<String,String> myMap2=new HashMap<String,String>();
		myMap2.put("One", "ABC");
		myMap2.put("Two", "DEF");
		myMap2.put("Two", "GHI");
		myMap2.put(null, "JKL");
		myMap2.put(null,null);
		myMap2.put("Three", null);
		myMap2.put("Four", null);
		for(Map.Entry<String,String> ent2:myMap2.entrySet()) {
			System.out.println("Key: "+ent2.getKey()+"\t Value:"+ent2.getValue());
		}
		
		
		System.out.println("\n==================== Linked HashMap ====================");
		/*
		 * 
		 * */
		
		System.out.println("\n==================== TreeMap ====================");
		/*
		 * 
		 * */
		
	}

}
