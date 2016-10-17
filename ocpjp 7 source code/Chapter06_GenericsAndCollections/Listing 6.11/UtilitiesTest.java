/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;
class UtilitiesTest {
	public static void main(String []args) {
		List<Integer> intList = new ArrayList<Integer>(); 
		intList.add(10);
		intList.add(20);
		System.out.println("The original list is: " + intList);
		Utilities.fill(intList, 100); 
		System.out.println("The list after calling Utilities.fill() is: " + intList);
	}
}
