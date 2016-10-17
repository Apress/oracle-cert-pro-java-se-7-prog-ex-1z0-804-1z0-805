/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

public class Rectangle implements Shape {
	public Rectangle(int length, int height) {
		this.length = length;
		this.height = height;
		System.out.println("Rectangle constructor");
	}
	private int length, height;
	@Override
	public void draw() {
		System.out.println("Rectangle draw()");
		// draw() implementation
	}
	@Override
	public void fillColor() {
		// fillColor() implementation
	}
}
