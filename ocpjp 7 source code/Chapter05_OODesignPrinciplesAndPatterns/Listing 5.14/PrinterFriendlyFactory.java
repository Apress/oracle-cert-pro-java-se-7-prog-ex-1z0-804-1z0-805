/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

public class PrinterFriendlyFactory implements ShapeFactory {
	@Override
	public Shape getShape(String sourceType) {
		switch(sourceType) {
			case "Circle":
				return new PrinterFriendlyCircle(10, 10, 20);
			case "Rectangle":
				return new PrinterFriendlyRectangle(10, 20);
		}
		return null;
	}
}