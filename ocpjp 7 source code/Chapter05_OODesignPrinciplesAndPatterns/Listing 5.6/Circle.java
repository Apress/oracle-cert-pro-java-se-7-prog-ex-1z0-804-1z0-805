/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.Observable;

public class Circle extends Observable {
	private Point center;
	public void setCenter(Point center) {
		this.center = center;
		setChanged();
		notifyObservers();
	}
	public void setRadius(int radius) {
		this.radius = radius;
		setChanged();
		notifyObservers();
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
