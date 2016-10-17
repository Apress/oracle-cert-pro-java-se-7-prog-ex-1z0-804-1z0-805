/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program demonstrates generic methods
import java.util.*;

class Utilities { 
	public static <T> void fill(List<T> list, T val) {
		for(int i = 0; i < list.size(); i++) 
			list.set(i, val); 
	}
}