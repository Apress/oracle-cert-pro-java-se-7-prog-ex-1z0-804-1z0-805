/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This example demonstrates how to search a "region" of text within a string  
public class MatchRegionInString {
	public static void main(String[] s) {
		String chat = "Tarzan: Hi Jane, wanna ride an Elephant? \n Jane: No thanks! I’m preparing for OCPJP now!";
		String matchString = " Jane: No thanks!"; 
		// first get the index of the position from which the search region starts
		int startIndex = chat.indexOf('\n');
		System.out.println("Jane's response starts at the index: " + startIndex);
// if "\n" found, then try matching for the string " Jane: No thanks!" from there
		if(startIndex > -1) { 
			// remember that the index starts from 0 and not 1, so add 1 to startIndex 
			boolean doesMatch = chat.regionMatches(startIndex + 1, matchString, 0, matchString.length());
			if(doesMatch)
				System.out.println("Jane’s response matches with the string" + matchString);
		}
	}
}