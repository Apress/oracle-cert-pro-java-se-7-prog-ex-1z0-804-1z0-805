/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class StatusReporter {
	// important to note that the argument "color" is declared final 
// otherwise, the local inner class DescriptiveColor will not be able to use it!! 
	static Shape.Color getDesciptiveColor(final Shape.Color color) {
		// local class DescriptiveColor that extends Shape.Color class 
		class DescriptiveColor extends Shape.Color {
			public String toString() {
				return "You selected a color with RGB values " + color; 
			}
		}
		return new DescriptiveColor();  
	}

	public static void main(String []args) {
		Shape.Color descriptiveColor = 
			StatusReporter.getDesciptiveColor(new Shape.Color(0, 0, 0));
		System.out.println(descriptiveColor);  	
	}
}