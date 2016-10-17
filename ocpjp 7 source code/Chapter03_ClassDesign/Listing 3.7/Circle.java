/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// a Circle object can be created by dragging and dropping a circle template
// the x, and y positions need to be set in that case, but a default radius value can be assumed 
class Circle{
	private int xPos, yPos, radius;
	public Circle(int x, int y) {
		xPos = x;
		yPos = y;	 
		radius = 10; // default radius 
	}
}