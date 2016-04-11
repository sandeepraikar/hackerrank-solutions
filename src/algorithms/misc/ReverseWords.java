package algorithms.misc;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		String inp = read.nextLine();
		String[] temp = inp.split(" ");
		System.out.println(temp);
		for (int i = temp.length - 1; i >= 0; i--) {
			System.out.print(temp[i] + " ");
		}
		read.close();
	}
}
