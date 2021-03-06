package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

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
		myList.add(1,"Kumar");
		
		
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
		
		System.out.println("\n### Storing user defined objects in Linked List ###");
		Student s1=new Student(001, "Anand","Ghaziabad",18);
		Student s2=new Student(002, "Seema","Delhi",20);
		Student s3=new Student(003, "Ashpinder","Punjab",17);
		ArrayList<Student> myList2nd=new ArrayList<Student>();
		myList2nd.add(s1);
		myList2nd.add(s2);
		myList2nd.add(s3);
		for(Student abc:myList2nd) {
			System.out.println("Roll number: "+abc.rollNumber+" | Name: "+abc.nameOfStudent+" | City: "+abc.city+" | Age: "+abc.age);
		}
		
		
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
		
		System.out.println("\n**************** Vector ****************");
		/*
		 * Vector uses a dynamic array to store the data elements. 
		 * It is similar to ArrayList. 
		 * However, It is synchronized and contains many methods that are not the part of Collection framework.
		 * */
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		System.out.println("\n**************** Stack ****************");
		/*
		 * The stack is the subclass of Vector. 
		 * It implements the last-in-first-out data structure, i.e., Stack. 
		 * The stack contains all of the methods of Vector class
		 * 
		 * */
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr2=stack.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		
		
	}
}

