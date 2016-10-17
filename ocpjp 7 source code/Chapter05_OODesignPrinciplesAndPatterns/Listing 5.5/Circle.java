/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// Circle class "informs" (i.e., "notifies") Canvas and ShapeArchiver whenever it gets "changed"
// by calling the update method of these two classes  
public class Circle {
	private Point center;
	public void setCenter(Point center) {
		this.center = center;
		canvas.update(this);
		shapeArchiver.update(this);
	}
	public void setRadius(int radius) {
		this.radius = radius;
		canvas.update(this);
		shapeArchiver.update(this);
	}
	private ShapeArchiver shapeArchiver;
	public void setShapeArchiver(ShapeArchiver shapeArchiver) {
		this.shapeArchiver = shapeArchiver;
	}
	protected Canvas canvas;
	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}
	private int radius;
	public Circle(int x, int y, int r) {	
		center = new Point(x, y); 
               	radius = r;
        	}
	public String toString() {
		return "center = " + center + " and radius = " + radius;
	}
}