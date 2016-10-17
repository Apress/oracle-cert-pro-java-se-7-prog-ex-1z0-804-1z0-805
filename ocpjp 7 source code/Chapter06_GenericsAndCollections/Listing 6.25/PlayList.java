/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program demonstrates some of the useful methods in Collections class

import java.util.*;

class PlayList {
	public static void main(String []args) {
		// let’s create a list of some Michael Jackson’s songs  	
		List<String> playList = new LinkedList<String>();
		playList.add("Rock With You - 1979"); 		
		playList.add("Billie Jean - 1983"); 
		playList.add("Man In the Mirror - 1988"); 
		playList.add("Black Or White - 1991"); 
  
		System.out.println("The original playlist of MJ's songs");
		System.out.println(playList); 
 
		System.out.println("\nThe reversed playlist");
		Collections.reverse(playList); 
		System.out.println(playList); 
 
		System.out.println("\nNow after shuffling the playlist");
		Collections.shuffle(playList); 
		System.out.println(playList); 
 
		System.out.println("\nSort the songs by their names ");
		Collections.sort(playList); 
		System.out.println(playList); 

		System.out.println("\nIs my most favourite song Black Or White - 1991 present in the list?");
		String backOrWhiteSong = "Black Or White - 1991"; 
		int index = Collections.binarySearch(playList, backOrWhiteSong); 
		if(index >= 0)
			System.out.printf("Yes, its the %d song \n", (index + 1)); 
		else
			System.out.printf("No, its not there in the playlist \n"); 
		
		System.out.println("\nLet me forward by two songs (rotate the list) ");
		Collections.rotate(playList, 2); 
		System.out.println(playList); 
 	} 
}
