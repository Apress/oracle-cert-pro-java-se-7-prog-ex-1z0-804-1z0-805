/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
package graphicshape;

public class Circle extends Shape {
	private int radius;	// private field
	public void area() {	// public method
		// access to private field radius inside the class
		System.out.println("area:"+3.14*radius*radius); 
	}
	void fillColor() {
		System.out.println("color:" + color); //access to protected field, in subclass
	}
}
