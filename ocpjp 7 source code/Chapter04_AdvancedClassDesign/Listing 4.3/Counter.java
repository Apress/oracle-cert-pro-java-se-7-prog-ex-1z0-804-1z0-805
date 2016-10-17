/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// Counter class should count the number of instances created from that class 
public class Counter {
	private static int count; // variable to store the number of objects created 
	// for every Counter object created, the default constructor will be called; 
	// so, update the counter value inside the default constructor 
	public Counter() { 
		count++;
	}
	public static void printCount() { // method to print the counter value so far 
		System.out.println("Number of instances created so far is: " + count);
	}
	public static void main(String []args) {
		Counter anInstance = new Counter();
		// note how we call printCount using the class name instead of instance variable name 
		Counter.printCount(); 
		Counter anotherInstance = new Counter();
		Counter.printCount();
	}
}
