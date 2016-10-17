/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program demonstrates the usage of ListIterator

import java.util.*;

class ListIteratorTest {
	public static void main(String []args) {
		String palStr = "abcba"; 
		List<Character> palindrome = new LinkedList<Character>();

		for(char ch : palStr.toCharArray())  
			palindrome.add(ch); 

		System.out.println("Input string is: " + palStr);
		ListIterator<Character> iterator = palindrome.listIterator();
	ListIterator<Character> revIterator = palindrome.listIterator (palindrome.size());
	
		boolean result = true;
		while(revIterator.hasPrevious() && iterator.hasNext()) {
			if(iterator.next() != revIterator.previous()){
				result = false;
				break;
			}
		}
		if (result)
			System.out.print("Input string is a palindrome");
		else
			System.out.print("Input string is not a palindrome");
		}
	}
