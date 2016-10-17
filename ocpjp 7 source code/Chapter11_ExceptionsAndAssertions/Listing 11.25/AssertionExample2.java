/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.Arrays;
class AssertionExample2 {
	public static void main(String []args) {
String [] jackieChanMovies = 
{"shanghai knights", "crime story", "heart of dragon", "police story", "drunken master"}; 
		System.out.println("Jackie Chan movies to watch are: ");
		for(String movie : jackieChanMovies) 
			System.out.println(movie);
		
		Arrays.sort(jackieChanMovies);
		// validate that sorting worked; 
// once sorted the first element should be "crime story" 
assert jackieChanMovies[0].equals("crime story") : "something went wrong in sorting Jackie Chan movie list";
		System.out.println("The sorted order of Jackie Chan movies to watch are: ");
		for(String movie : jackieChanMovies) 
			System.out.println(movie);
	}
}
