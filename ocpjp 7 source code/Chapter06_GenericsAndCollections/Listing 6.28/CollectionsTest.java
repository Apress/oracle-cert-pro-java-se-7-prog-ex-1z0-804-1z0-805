/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// It demonstrates sorting on Arrays
import java.util.*;

class CollectionsTest {
public static void  main(String []args) {
String [] strArr = { "21", "1", "111", "12", "123" }; 
Arrays.sort(strArr);
	System.out.println(Arrays.toString(strArr));
 
		int [] intArr = { 21, 1, 111, 12, 123 }; 
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
    	}
}
 
