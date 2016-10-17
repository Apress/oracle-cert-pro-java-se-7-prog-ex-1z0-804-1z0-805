/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

public class DisplayFriendlyCircle implements DisplayFriendlyShape {
private int xPos, yPos;
	private int radius;
	public DisplayFriendlyCircle(int x, int y, int r) {
		xPos = x;
		yPos = y;
        		radius = r;
	        	System.out.println("DisplayFriendlyCircle constructor");
        	}
	@Override
	public void draw() {
		System.out.println("DisplayFriendlyCircle draw()");
		// draw() implementation
	}
}
