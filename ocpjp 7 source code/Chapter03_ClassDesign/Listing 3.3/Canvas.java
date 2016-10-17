/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
package appcanvas;
import graphicshape.Circle;

class Canvas {
	void getArea() {
		Circle  circle = new Circle();
		circle.area(); 	// call to public method area(), outside package
	}
}
