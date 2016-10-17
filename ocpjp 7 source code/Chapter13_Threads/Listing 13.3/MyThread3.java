/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class MyThread3 implements Runnable {
        public void run() {
                System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
        }

        public static void main(String args[]) throws Exception {
                Thread myThread = new Thread(new MyThread3());
                myThread.run(); // note run() instead of start() here 
                System.out.println("In main method; thread name is : " + Thread.currentThread().getName());
        }
}
