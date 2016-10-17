/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

public class DisplayFriendlyRectangle implements DisplayFriendlyShape {
	public DisplayFriendlyRectangle(int length, int height) {
		this.length = length;
		this.height = height;
		System.out.println("DisplayFriendlyRectangle constructor");
	}
	private int length, height;
	@Override
	public void draw() {
		System.out.println("DisplayFriendlyRectangle draw()");
		// draw() implementation
	}
}