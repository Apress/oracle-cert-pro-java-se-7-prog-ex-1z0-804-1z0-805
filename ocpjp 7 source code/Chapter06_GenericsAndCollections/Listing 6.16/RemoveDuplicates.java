/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program demonstrates the usage of HashSet class 

import java.util.*;

class RemoveDuplicates {
	public static void main(String []args) {
	String tongueTwister = "I feel, a feel, a funny feel, a funny feel I feel, if you feel the feel  I feel, I feel the feel you feel"; 
		Set<String> words = new HashSet<>();

		// split the sentence into words and try putting them in the set 
		for(String word : tongueTwister.split("\\W+")) 
			words.add(word); 
 
		System.out.println("The tongue twister is: " + tongueTwister);
  		System.out.print("The words used were: "); 
		System.out.println(words);
	}       
}