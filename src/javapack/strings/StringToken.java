package javapack.strings;

import java.util.Scanner;

/*
 * Given a string, find number of words in that string. For this problem a word is defined by a string of one or more english alphabets.

 There are multiple ways to tokenize a string in java, learn how to tokenize a string in java and demonstrate your skill by solving this problem!

 Input Format
 A string not more than 400000 characters long. The string can be defined by following regular expression:

 [A-Za-z !,?.\_'@]+

 That means the string will only contain english alphabets, blank spaces and this characters: "!,?._'@".
 * */
public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		// Complete the code
		if (s.trim().length() == 0 || s.trim().length() > 400000) {
			System.out.println(0);
			return;
		}

		String words[] = s.trim().split("[ !,?.\\_'@]+");
		System.out.println(words.length);
		for (String word : words)
			System.out.println(word);
	}

}
