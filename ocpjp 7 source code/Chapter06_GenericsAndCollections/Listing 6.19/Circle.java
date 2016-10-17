/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

// This program shows the importance of equals() and hashCode() methods

import java.util.*;

class Circle {
	private int xPos, yPos, radius;
	public Circle(int x, int y, int r) {
		xPos = x; 
		yPos = y;
		radius = r; 
	}
	
	public boolean equals(Object arg) {
		if(arg == null) return false; 
		if(this == arg) return true;
		if(arg instanceof Circle) {
			Circle that = (Circle) arg; 
			if( (this.xPos == that.xPos) && (this.yPos == that.yPos) 
&& (this.radius == that.radius )) {
				return true;
			}
		}
		return false;
	}
}
