/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
public class Circle {
	private int xPos, yPos;
	private int radius;
	public Circle(int x, int y, int r) {
		xPos = x;
		yPos = y;
        		radius = r;
        	}
	public String toString() {
		return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
	}
	public CircleTransfer getCircleTransferObject() {
		CircleTransfer circleTransfer = new CircleTransfer();
		circleTransfer.setRadius(radius);
		circleTransfer.setxPos(xPos);
		circleTransfer.setyPos(yPos);
		return circleTransfer;
	}
	// other members 
}
