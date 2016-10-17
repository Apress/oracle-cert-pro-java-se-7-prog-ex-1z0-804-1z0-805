/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class Circle extends Shape {
	private int radius; 
	public Circle(int r) { radius = r; } 
	// other constructors 
	public double area() {return Math.PI * radius * radius; } 
	// other declarations
}
