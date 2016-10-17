/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;
//This program shows the usage of HashMap class
public class SpellChecker {
      public static void main(String []args) {
            Map<String, String> misspeltWords = new HashMap<String, String>();
            misspeltWords.put("calender", "calendar");
            misspeltWords.put("tomatos", "tomatoes");
            misspeltWords.put("existance", "existence");
            misspeltWords.put("aquaintance", "acquaintance");
            String sentence = "Buy a calender for the year 2013";
            System.out.println("The given sentence is: " + sentence);
            for(String word : sentence.split("\\W+")) {
                  if(misspeltWords.containsKey(word)) {
                        System.out.println("The correct spelling for " + word
                                    + " is: " + misspeltWords.get(word));
                  }
            }
      }
}
