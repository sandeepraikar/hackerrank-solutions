package algorithms.dynammicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubArray {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for (int i = 0; i < t; i++) {
			int n = read.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = read.nextInt();
			}
			int maxSumSoFar = Integer.MIN_VALUE;
			int maxEnding = 0;
			int nonContSum = 0;
			for (int x : arr) {
				maxEnding = Math.max(x, maxEnding + x);
				maxSumSoFar = Math.max(maxEnding, maxSumSoFar);

			}
			System.out.print(maxSumSoFar);

			// 2) For max non-continuous sub array, order doesn't matter
			Arrays.sort(arr);
			int sum = 0;

			// if there is none positive value in entire array
			if (arr[arr.length - 1] <= 0) {
				sum = arr[arr.length - 1];
				
			} else {
				for (int x : arr) {
					if (x > 0)
						sum += x;
				}
			}
			System.out.println(" " + sum);
		}
		read.close();
	}
}