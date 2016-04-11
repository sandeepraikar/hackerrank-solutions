package algorithms.misc;

import java.util.HashMap;
/**
 * Given a list find pairs of integers whose sum is equal to the given value k
 * **/
public class ListPair {

	public static void printPair(int a[], int subValue) {
		HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			store.put(a[i], 1);
		}
		for (int i = 0; i < a.length; i++) {
			if (store.containsKey(a[i] - subValue)) {
				System.out.println("(" + a[i] + "," + (a[i] - subValue) + ")");
			}
			if (store.containsKey(a[i] + subValue)) {
				System.out.println("(" + a[i] + "," + (a[i] + subValue) + ")");
			}
			store.remove(a[i]);
		}

	}

	public static void main(String[] args) {

		int a[] = { 7, 6, 23, 19, 10, 11, 9, 3, 15 };
		printPair(a, 4);

	}

}
