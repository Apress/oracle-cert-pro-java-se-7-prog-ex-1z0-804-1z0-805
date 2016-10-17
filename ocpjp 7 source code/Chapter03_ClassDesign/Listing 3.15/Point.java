/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// improved version of the Point class with overridden toString method 
class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	// this toString method overrides the default toString method implementation 
	// provided in the Object base class 
	public String toString() {
		return "x = " + xPos + ", y = " + yPos; 
	} 

	public static void main(String []args) {
		System.out.println(new Point(10, 20)); 
	}	
}
