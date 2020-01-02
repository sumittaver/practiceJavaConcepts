package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {

	public static void main(String[] args) {
		/*
		 * Set is interface which do not allow duplicate values
		 * Set is not preserve insertion order 	 
		 * Set having Classes: HashSet, LinkedHashSet and TreeSet
		 * 
		 * */
		
		System.out.println("==================== HashSet ====================");
		/*
		 * HashSet class implements Set Interface. 
		 * It represents the collection that uses a hash table for storage. 
		 * Hashing is used to store the elements in the HashSet. 
		 * It contains unique items.
		 * */
		Set<String> mySet=new HashSet<String>();
		mySet.add("ravi");
		mySet.add("sunny");
		mySet.add("geeta");
		mySet.add("chetan");
		mySet.add(null);//1 null is allowed
		mySet.add("sunny");//Trying to add duplicate
		mySet.add(null);//This null is replacing to another one
		System.out.println("-----Print using forEach---------------------");
		for(String prnt:mySet) {System.out.println(prnt);}//Printing set
		System.out.println("-----Print using Stream----------------------");
		mySet.forEach(System.out::println);//Printing set 2nd method
		
		System.out.println("\n==================== LinkedHashSet ====================");
		/*
		 * LinkedHashSet class represents the LinkedList implementation of Set Interface. 
		 * It extends the HashSet class and implements Set interface. 
		 * Like HashSet, It also contains unique elements. 
		 * It maintains the insertion order and permits null elements.
		 * */
		LinkedHashSet<String> myLinkHS=new LinkedHashSet<String>();
		myLinkHS.add("ravi");
		myLinkHS.add("sunny");
		myLinkHS.add("geeta");
		myLinkHS.add("chetan");
		myLinkHS.add(null);
		myLinkHS.add("chetan");//Duplicate value
		System.out.println("-----Print using forEach---------------------");
		for (String st2:myLinkHS) {System.out.println(st2);}
		
		System.out.println("\n==================== TreeSet ====================");
		/*
		 * Java TreeSet class implements the Set interface that uses a tree for storage. 
		 * Like HashSet, TreeSet also contains unique elements. 
		 * However, the access and retrieval time of TreeSet is quite fast. 
		 * The elements in TreeSet stored in ascending order.
		 * Null is not allowed.
		 * */
		TreeSet<String> myTreeSet=new TreeSet<String>();
		myTreeSet.add("ravi");
		myTreeSet.add("sunny");
		myTreeSet.add("geeta");
		myTreeSet.add("chetan");
		//myTreeSet.add(null); Note: Null is not allowed
		myTreeSet.add("chetan");//Duplicate value
		System.out.println("-----Print using forEach---------------------");
		for (String st2:myTreeSet) {System.out.println(st2);}
	}

}
