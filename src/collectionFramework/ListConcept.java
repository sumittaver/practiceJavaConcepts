package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListConcept {

	public static void main(String[] args) {
		System.out.println("\n**************** Array List ****************");
		/*
		 * List is an interface and these 4 classes ArrayList, LinkedList, Vector and stack
		 * implements List interface. 
		 * List can have duplicate elements. 
		 * List is preserve insertion order.
		 * It works based on indexes.
		 * It is called dynamic array as well, performance wise it is slow as compare array.
		 * It is better to store and access data.
		 */ 
		
		ArrayList<String> myList=new ArrayList<String>();
		myList.add("sumit");
		myList.add("Tavar");
		
		System.out.println("\n### Printing using Iterator ###");
		Iterator<String> myIterator=myList.iterator();
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		System.out.println("\n### Printing using ForEach ###");
		for (String tmp:myList) {
			System.out.println(tmp);
		}
		
		System.out.println("\n### Printing using JAVA 8 Stream ###");
		myList.stream().forEach(System.out::println);
		
		System.out.println("\n### Printing using For Loop ###");
		for (int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		
		ListConcept sConcept=new ListConcept();
		
		System.out.println("\n**************** Linked List ****************");
		/*
		 * Link list is use doubly linked list to store the values.
		 * Link list have two parts data and address to next node.
		 * It is better to manipulate data.
		 * All other things are same as Linked List.
		 * */
		System.out.println("\n### Printing using For Loop ###");
		LinkedList<String> myLinkedList=new LinkedList<String>();
		myLinkedList.add("This");
		myLinkedList.add("is");
		myLinkedList.add("my");
		myLinkedList.add("home.");
		for(String string:myLinkedList) {
			System.out.println(string);
		}
		
		
		
	}
}

