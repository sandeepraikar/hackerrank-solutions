package algorithms.search;

import java.util.Scanner;

public class SherlockAndArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			String answer = "NO";
			int n = in.nextInt();

			int[] a = new int[n];
			int total = 0;
			for (int j = 0; j < n; j++) {
				a[j] = in.nextInt();
				total = total + a[j];
			}
			if (n == 1) {
				answer = "YES";
				System.out.println(answer);
				continue;
			}
			if (n == 2) {
				System.out.println(answer);
				continue;
			}
			int left = 0;
			int right = total;
			for (int j = 1; j < n - 1; j++) {
				left = left + a[j - 1];
				right = total - a[j] - left;
				if (left == right) {
					answer = "YES";
					break;
				}
			}
			System.out.println(answer);
		}
		in.close();
	}

}
