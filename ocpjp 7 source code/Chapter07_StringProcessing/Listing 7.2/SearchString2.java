/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// Demonstrates searching a substring within a string using indexOf() method
public class SearchString2 {
	public static void main(String[] s){
		String str = "I am preparing for OCPJP";
		System.out.println("Substring \"for\" occurs at index: " + str.indexOf("for"));
	}
}