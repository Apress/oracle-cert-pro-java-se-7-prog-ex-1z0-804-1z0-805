/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

class Overloaded {
	public static void aMethod (byte val )  { System.out.println ("byte");  }
	public static void aMethod (short val ) { System.out.println ("short"); }

	public static void main(String[] args) {
		aMethod(9);
	}
}  
