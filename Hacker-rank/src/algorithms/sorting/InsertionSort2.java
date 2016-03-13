package algorithms.sorting;

import java.util.Scanner;

public class InsertionSort2 {

	public static void insertionSortPart2(int[] ar) {
		// Fill up the code for the required logic here
		// Manipulate the array as required
		// The code for Input/Output is already provided

		int size = ar.length;
		int temp = 0;
		int j= 0;
		for (int i = 0; i < size - 1; i++) {
			j = i;
			//val = ar[i];
			while (j >= 0) {
				if (ar[j] > ar[j + 1]) {
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
				j--;
			}
			printArray(ar);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		in.close();
		// int[] ar = { 9, 8, 6, 7, 3, 5, 4, 1, 2};
		// insertionSortPart2(ar);
		insertionSortPart2(ar);

	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
