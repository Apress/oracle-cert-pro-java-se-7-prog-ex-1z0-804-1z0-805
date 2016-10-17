/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
public class TestNumber {
	// take an array of numbers and sum them up 
	public static double sum(Number []nums) {
		double sum = 0.0;
		for(Number num : nums) {
        		sum += num.doubleValue();
	    	}
	    	return sum;
	}

	public static void main(String []s) {
    		// Create a Number array 
    		Number []nums = new Number[4];
    		// assign derived class objects 
        		nums[0] = new Byte((byte)10);
        		nums[1] = new Integer(10);
        		nums[2] = new Float(10.0f);
        	nums[3] = new Double(10.0f);
        		// pass the Number array to sum and print the result 
        		System.out.println("The sum of numbers is: " + sum(nums));
	}
} 
