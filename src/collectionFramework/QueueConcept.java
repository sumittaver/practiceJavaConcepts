package collectionFramework;

import java.util.PriorityQueue;

import java.util.Iterator;

public class QueueConcept {

	public static void main(String[] args) {
		System.out.println("==================== Queue ====================");
		/*
		 * Queue interface maintains the first-in-first-out order. 
		 * It can be defined as an ordered list that is used to hold the elements which are about to be processed. 
		 * There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
		 * */
		
		System.out.println("==================== PriorityQueue ====================");
		/*
		 * The PriorityQueue class implements the Queue interface. 
		 * It holds the elements or objects which are to be processed by their priorities. 
		 * PriorityQueue doesn't allow null values to be stored in the queue
		 * */
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator<String> itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		
		
	}

}
