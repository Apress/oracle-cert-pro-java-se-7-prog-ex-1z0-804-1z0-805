/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class Overloaded {
	public static void aMethod (long val1, int val2) { 
		System.out.println ("long, int");
	}
	
public static void aMethod (int val1, long val2) { 
		System.out.println ("int, long");
	}
	
public static void main(String[] args) {
    		aMethod(9, 10);
	}
}