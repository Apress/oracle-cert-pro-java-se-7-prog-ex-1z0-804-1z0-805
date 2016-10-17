/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.ArrayList;
import java.util.Iterator;

public class Canvas {
	private ArrayList<Shape> shapeList = new ArrayList<Shape>();
	public void addNewShape(String shapeType) {
		Shape shape = ShapeFactory.getShape(shapeType);
		shapeList.add(shape);
	}
	public void redraw() {
		Iterator<Shape> itr = shapeList.iterator();
		while(itr.hasNext()) {
			Shape shape = itr.next();
			shape.draw();
		}
	}
}
