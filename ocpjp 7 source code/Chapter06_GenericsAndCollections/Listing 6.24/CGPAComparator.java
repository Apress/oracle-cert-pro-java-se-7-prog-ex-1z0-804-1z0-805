/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program shows the implementation of Comparator interface

import java.util.*;

class CGPAComparator implements Comparator<Student> {
public int compare(Student s1, Student s2) {
return (s1.cgpa.compareTo(s2.cgpa));     
}    
}
