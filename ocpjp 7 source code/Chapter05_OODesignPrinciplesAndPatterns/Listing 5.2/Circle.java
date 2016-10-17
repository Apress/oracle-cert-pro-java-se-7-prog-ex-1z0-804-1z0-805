/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
public class Circle {
	private Point center;	// Circle "contains" a Point object 
	private int radius;
	public Circle(int x, int y, int r) {	
		center = new Point(x, y); 
               	radius = r;
        	}
	public String toString() {
		return "center = " + center + " and radius = " + radius;
	}

	public static void main(String []s) {
		System.out.println(new Circle(10, 10, 20));
       	}	 
	// other members (constructors, area method, etc) are elided ...  
}