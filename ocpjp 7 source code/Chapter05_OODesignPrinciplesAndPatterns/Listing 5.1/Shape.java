/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

// Shape is the base class for all shape objects; shape objects that are associated with 
// a parent shape object is remembered in the parentShape field 
public abstract class Shape {
	abstract double area();
	private Shape parentShape;
	public void setParentShape(Shape shape) {
		parentShape = shape;
	}
	public Shape getParentShape() {
		return parentShape;
	}
}