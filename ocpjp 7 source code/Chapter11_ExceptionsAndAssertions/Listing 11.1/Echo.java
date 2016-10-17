/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// A simple program without exception handling code
class Echo {
	public static void main(String []args) {
		if(args.length == 0) { 
// no arguments passed – display an error to the user 
			System.out.println("Error: No input passed to echo command... "); 
			System.exit(-1); 
		}
		else {
			for(String str : args) {
// command line arguments are separated and passed as an array
				// print them by adding a space between the array elements 
				System.out.print(str + " "); 
			}
		}
	}
}