package algorithms.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* rules for a string to be a palindrome!!!

If len(str) is even, count of each elemnt should be even.

If len(str) is odd, count of ONLY one element should be odd, counts of all other elements should be even. 

 */
public class GameOfThrones1 {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String inputString = myScan.nextLine();
        char[] inputArray = inputString.toCharArray();
		Map<Character, Integer> mapper = new HashMap<>();
		for (char item : inputArray) {
			Integer val = mapper.get(item);
			if (val == null) {
				val = Integer.valueOf(1);
			} else {
				val = val + 1;
			}
			mapper.put(item, val);
		}
		
		//for (Map.Entry<Character,Integer> entry : mapper.entrySet()) {
		//	System.out.println(entry.getKey()+":"+entry.getValue());
		//}
		boolean canMakePalindrome = true;
		if (inputString.length() % 2 == 0) {
			for (int x : mapper.values()) {
				if (x % 2 != 0) {
					canMakePalindrome=false;
					break;
				}
			}
			if(canMakePalindrome){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		} else {
			canMakePalindrome = false;
			for (int x : mapper.values()) {
				if (x % 2 == 1) {
					if (canMakePalindrome) {
                        canMakePalindrome=false;
						break;
					} else {
						canMakePalindrome = true;
					}
				}
			}if(canMakePalindrome){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

		}
		myScan.close();
	}
}
