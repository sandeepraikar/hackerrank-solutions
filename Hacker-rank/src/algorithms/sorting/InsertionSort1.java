package algorithms.sorting;

import java.util.Scanner;


public class InsertionSort1 {

	public static void main(String args[]) {
		// int[] ar = {2,4,6,8,3};
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		in.close();
		insertIntoSorted(ar);
	}

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		boolean check = false;
		int size = ar.length;
		int element = ar[size - 1];
		for (int i = size - 2; i >= 0; i--) {
			if (ar[i] > element) {
				ar[i + 1] = ar[i];
				printArray(ar);
			} else {
				ar[i + 1] = element;
				check = true;
				printArray(ar);
				break;
			}

		}
		if (check == false) {
			ar[0] = element;
		}
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
