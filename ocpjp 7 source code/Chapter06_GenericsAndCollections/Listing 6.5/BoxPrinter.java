/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program demonstrates the type-safety feature of generics
class BoxPrinter<T> {
	private T val; 
	public BoxPrinter(T arg) {
		val = arg; 
	}  
	public String toString() {
		return "[" + val + "]"; 
	}
	public T getValue() {
		return val; 
	} 
} 