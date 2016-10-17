/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;

// Simple PriorityQueue example. Here, we create two threads in which one thread inserts an element, 
// and another thread removes an element from the priority queue. 
class PriorityQueueExample {
	public static void main(String []args) {
		final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		// spawn a thread that removes an element from the priority queue 
new Thread() { 
			public void run() {
				// Use remove() method in PriorityQueue to remove the element if available 
				System.out.println("The removed element is: " + priorityQueue.remove());
			}
		}.start();
		// spawn a thread that inserts an element into the priority queue 
		new Thread() { 
			public void run() {
				// insert Integer value 10 as an entry into the priority queue 
				priorityQueue.add(10); 
				System.out.println("Successfully added an element to the queue ");  
			}
		}.start();
	}
}
