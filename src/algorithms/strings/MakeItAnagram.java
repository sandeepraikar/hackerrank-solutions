package algorithms.strings;

import java.util.Scanner;

public class MakeItAnagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        String s1 = read.next();
        String s2 = read.next();
        read.close();
        
        int[] temp = new int[26];
		for(int i=0;i<s1.length();i++){
			temp[s1.charAt(i)-'a']++;
        }
		
		for(int i=0;i<s2.length();i++){
			temp[s2.charAt(i)-'a']--;
        }
		int count = 0;
		for(int i=0;i<26;i++){
			count+=Math.abs(temp[i]);
		}
        System.out.println(count);
    }
}