/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program shows the usage of Iterator

import java.util.*; 

class TestIterator {
    public static void main(String []args) {
         ArrayList<Integer> nums = new ArrayList<Integer>();   
         for(int i = 1; i < 10; i++) 
              nums.add(i); 
         System.out.println("Original list " + nums); 
         Iterator<Integer> numsIter = nums.iterator();
         while(numsIter.hasNext()) {
                     numsIter.remove();  
         } 
         System.out.println("List after removing all elements" + nums); 
    }
}
