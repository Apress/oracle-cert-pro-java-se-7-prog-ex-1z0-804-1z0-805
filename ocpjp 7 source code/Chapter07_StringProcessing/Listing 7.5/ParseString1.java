/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// this example demonstrates the usage of split() method
public class ParseString1 {
	public static void main(String[] s) {
		String quote = "Never lend books-nobody ever returns them!";
		String [] words = quote.split(" "); // split strings based on the delimiter " " (space)
		for (String word : words) {
			System.out.println(word);
		}
	}
}
