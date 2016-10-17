/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program shows the usage of formatting string in printf() method
class Circle {
	private int x, y, radius;
	public Circle(int x, int y, int radius) {
		this.x =x;
		this.y = y;
		this.radius = radius;
	}
	void area() {
		double tempArea = Math.PI * radius * radius;  
		System.out.println("Cirle area using default formatting with println: " + tempArea);
		System.out.printf("Circle area using format specifier with printf: %.2f",  tempArea);
	}
	public static void main(String[] str) {
		Circle circle = new Circle(10,10,5);
		circle.area();
	}
}