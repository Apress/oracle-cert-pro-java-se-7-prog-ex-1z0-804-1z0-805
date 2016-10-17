/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class TestShape {
	public static void main(String []args) {
		Shape shape1 = new Circle(10);
		System.out.println(shape1.area()); 
		Shape shape2 = new Square(10);
		System.out.println(shape2.area()); 
	}
}
