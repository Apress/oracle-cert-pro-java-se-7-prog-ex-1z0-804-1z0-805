/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

public class PrinterFriendlyCircle implements PrinterFriendlyShape{
	private int xPos, yPos;
	private int radius;
	public PrinterFriendlyCircle(int x, int y, int r) {
		xPos = x;
		yPos = y;
       		radius = r;
		System.out.println("PrinterFriendlyCircle constructor");
        	}
	@Override
	public void draw() {
		System.out.println("PrinterFriendlyCircle draw()");
		// draw() implementation
	}
}
