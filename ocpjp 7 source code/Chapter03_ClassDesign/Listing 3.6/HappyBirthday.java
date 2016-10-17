/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class HappyBirthday {
// overloaded wish method with String as an argument 
public static void wish(String name) {
System.out.println("Happy birthday " + name + "!");
}

// overloaded wish method with no arguments; this method in turn invokes wish(String) method   
public static void wish() {
wish("to you");
}

public static void main(String []args) {
wish();
wish("dear James Gosling");
}
}