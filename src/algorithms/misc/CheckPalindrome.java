package algorithms.misc;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
		String word = read.next();
		read.close();
		System.out.println(checkPalindrome(word));
	}

	private static boolean checkPalindrome(String word) {
		char[] s1 = word.toCharArray();
		int j=s1.length-1;
		for(int i=0;i<s1.length;i++){
			if(s1[i]!=s1[j]){
				return false;
			}
			j--;
		}
		return true;
	}
}
