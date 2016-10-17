/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class Point2D {
private int xPos, yPos;
public Point2D(int x, int y) {
xPos = x;
yPos = y;
}

public String toString() {
return "x = " + xPos + ", y = " + yPos;
}

public static void main(String []args) {
System.out.println(new Point2D(10, 20));
}
}
