/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class NonTerminatingRecursion {
	// factorial is a recursive call 
	static int factorial(int n) {
		int result = 0; 
		// Assume that the following termination condition statement is missing ...  
		// if(n == 0) return 1; 
		result = factorial(n - 1) * n;
		return result; 
	}
	public static void main(String ... args) {
		System.out.println("factorial of 4 is: " + factorial(4)); 
	}
}
