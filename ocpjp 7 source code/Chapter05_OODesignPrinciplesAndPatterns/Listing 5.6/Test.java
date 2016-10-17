/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
public class Test {
	public static void main(String []s) {
		Circle circle = new Circle(10, 10, 20);
		System.out.println(circle);
		circle.addObserver(new Canvas());
		circle.addObserver(new ShapeArchiver());
		circle.setRadius(50);
		System.out.println(circle);
       	}	
}
