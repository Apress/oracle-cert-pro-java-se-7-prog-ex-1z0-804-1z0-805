/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program shows the usage of Comparable interface

import java.util.*;

class Student implements Comparable<Student> {
String id;
String name;
Double cgpa; 
public Student(String studentId, String studentName, double studentCGPA) {
id = studentId;
name = studentName;
cgpa = studentCGPA; 
}
public String toString() {
return " \n " + id + "  \t  " + name + "  \t  " + cgpa;
}    
public int compareTo(Student that) {
return this.id.compareTo(that.id);     
}
}
 
