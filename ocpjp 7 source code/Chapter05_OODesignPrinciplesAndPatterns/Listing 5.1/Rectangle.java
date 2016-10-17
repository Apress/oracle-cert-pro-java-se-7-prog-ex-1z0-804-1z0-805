/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

// Rectangle is a concrete class and "is-a" Shape; it can be rotated and hence implements Rotatable  
public class Rectangle extends Shape implements Rotatable {
	private int length, height;
	public Rectangle(int l, int h) {
		length = l;
		height = h;
	}
	public double area() { return length * height; }
	@Override
	public void rotate(float degree) {
		// implement rotating functionality here
	}
} 