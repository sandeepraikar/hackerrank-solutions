package javapack.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner read = new Scanner(System.in);
		ArrayList<ArrayList<String>> list = new ArrayList<>();
		ArrayList<String> temp;
		int n = read.nextInt();
		for (int i = 0; i < n; i++) {
			temp = new ArrayList<String>();
			int m = read.nextInt();
			for (int j = 0; j < m; j++) {
				temp.add(read.next());
			}
			list.add(temp);
		}
		n = read.nextInt();
		for (int i = 0; i < n; i++) {
			int m = read.nextInt();
			int k = read.nextInt();
			try {
				temp = (ArrayList<String>) list.get(m - 1);
				System.out.println(temp.get(k - 1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}
		read.close();
	}
}
