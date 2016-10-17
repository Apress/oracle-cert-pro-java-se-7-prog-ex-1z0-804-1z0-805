/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program shows the usage of Deque interface

import java.util.*;

class SplQueue {
	private Deque<String> splQ = new ArrayDeque<>();
	void addInQueue(String customer){
		splQ.addLast(customer);
	}
	void removeFront(){
		splQ.removeFirst();
	}
	void removeBack(){
		splQ.removeLast();
	}
	void printQueue(){
		System.out.println("Special queue contains: " + splQ);
	}
}