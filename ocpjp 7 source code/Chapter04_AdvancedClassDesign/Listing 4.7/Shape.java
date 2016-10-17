/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
abstract class Shape {  
          public static class Color {  
                  int m_red, m_green, m_blue;  
                  public Color() {  
                          this(0, 0, 0);  
                  }  
                  public Color(int red, int green, int blue) {  
                          m_red = red; m_green = green; m_blue = blue;  
                  }  
                  public String toString() {  
                          return " red = " + m_red + " green = " + m_green + " blue = " + m_blue;  
                  }  
                  // other color members elided  
          }  
          // other Shape members elided  
  }  