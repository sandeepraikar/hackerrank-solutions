package algorithms.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CanMakePalindrome {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String input = read.next();
		read.close();
		//System.out.println(canMakePalindrom(input)); 
		System.out.println(canMakePalindrom("akka")); //testing

	}
	private static boolean canMakePalindrom(String s) {
	    Map<Character, Integer> countChars = new HashMap<>();

	    // Count the occurrences of each character
	    for (char c : s.toCharArray()) {
	        Integer count = countChars.get(c);
	        if (count == null) {
	            count = Integer.valueOf(1);
	        } else {
	            count = count + 1;
	        }
	        countChars.put(c, count);
	    }

	    boolean hasOdd = false;
	    for (int count : countChars.values()) {
	        if (count % 2 == 1) {
	            if (hasOdd) {
	                // Found two chars with odd counts - return false;
	                return false;
	            } else {
	                // Found the first char with odd count
	                hasOdd = true;
	            }
	        }
	     }

	     // Haven't found more than one char with an odd count
	     return true;
	}

}
