/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class AssertionExample1 {
	public static void main(String []args) {
		int i = -10;
		if(i < 0) {
			// if negative value, convert into positive value 
			i = -i; 
		}
		System.out.println("the value of i is: " + i); 
		// at this point the assumption is that i cannot be negative; 
		// assert this condition since its an assumption that will always hold 
		assert (i >= 0) : "impossible: i is negative!";
	}
}
