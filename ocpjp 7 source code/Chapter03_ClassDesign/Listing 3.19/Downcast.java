/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// Code to understand how downcast can fail 
class Downcast {
	public static void main(String []args) {
		Integer i = new Integer(10);
		// upcast - its fine and will always succeed		
		Object obj = i; 
		// downcast - will it succeed? What will happen when it fails?
		String str = (String) obj; 
	}
}