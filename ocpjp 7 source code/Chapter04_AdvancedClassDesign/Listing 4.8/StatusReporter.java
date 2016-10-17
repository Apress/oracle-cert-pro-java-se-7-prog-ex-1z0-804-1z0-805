/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class StatusReporter {
	static Shape.Color getDesciptiveColor(final Shape.Color color) {
		// note the use of anonymous inner classes here -- specifically, there is no name 
		// for the class and we construct and use the class "on the fly" in the return statement! 
		return new Shape.Color() {
			public String toString() {
				return "You selected a color with RGB values " + color; 
			}
		}; 
	}
	public static void main(String []args) {
		Shape.Color descriptiveColor = 
			StatusReporter.getDesciptiveColor(new Shape.Color(0, 0, 0));
		System.out.println(descriptiveColor);  	
	}
}
