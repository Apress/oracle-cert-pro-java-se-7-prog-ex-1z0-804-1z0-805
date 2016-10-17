/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

// Circle is a concrete class that "is-a" subtype of Shape; you can roll it and hence implements Rollable 
public class Circle extends Shape implements Rollable {
	private int xPos, yPos, radius;
	public Circle(int x, int y, int r) {
		xPos = x;
		yPos = y;
		radius = r;
	}
	public double area() { return Math.PI * radius * radius; }
	@Override
	public void roll(float degree) {
		// implement rolling functionality here
	}
	public static void main(String[] s) {
		Circle circle = new Circle(10,10,20);
		circle.roll(45);
	}
}