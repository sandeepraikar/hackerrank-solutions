package ctci.solutions;
import java.util.Scanner;

public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int[] letterCount = new int[26];
      for(char x: first.toCharArray()) {
			letterCount[x-'a']++;	
		}
		for(char x: second.toCharArray()) {
			letterCount[x-'a']--;	
		}
		int total = 0;
		for(int x : letterCount) {
			total+=Math.abs(x);
		}
        return total;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
        in.close();
    }
}
