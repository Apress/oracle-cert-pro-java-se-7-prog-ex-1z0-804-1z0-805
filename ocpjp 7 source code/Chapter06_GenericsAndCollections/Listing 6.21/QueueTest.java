/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program shows the key characteristics of Queue interface

import java.util.*;

class QueueTest {
	public static void main(String []args) {
		Queue<String> loginSequence = new LinkedList<String>();
		
		loginSequence.add("Harrison"); 
		loginSequence.add("McCartney"); 
		loginSequence.add("Starr"); 
		loginSequence.add("Lennon"); 
		System.out.println("The login sequence is: " + loginSequence);
		while(!loginSequence.isEmpty())
			System.out.println("Removing " + loginSequence.remove());
	}
}
