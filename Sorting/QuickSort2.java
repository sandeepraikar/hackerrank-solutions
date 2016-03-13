import java.util.*;

public class QuickSort2 {

	static void quickSort(int[] ar) {		
		sortImpl(ar, 0, ar.length - 1);
	}

	static void sortImpl(int[] ar, int start, int end) {
		if (start < end) {
			int p = partition(ar, start, end);
			sortImpl(ar, start, p - 1);
			sortImpl(ar, p + 1, end);
			printArray(ar, start, end);
		}
	}

	static int partition(int[] ar, int start, int end) {
		int pivot = ar[start];
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();

		for (int i = start + 1; i <= end; i++) {
			if (ar[i] <= pivot) {
				left.add(ar[i]);
			}
			else {
				right.add(ar[i]);
			}
		}
		for (int k = 0; k < left.size(); k++) {
			ar[start + k] = left.get(k);
		}
		ar[start + left.size()] = pivot;

		for (int l = 0; l < right.size(); l++)
			ar[left.size() + start + l + 1] = right.get(l);
		return start + left.size();
	}

	static void printArray(int[] ar, int p, int r) {
		for (int i = p; i <= r; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 * int n = in.nextInt(); int[] ar = new int[n]; for (int i = 0; i < n;
		 * i++) { ar[i] = in.nextInt(); }
		 */
		int[] ar = { 5, 8, 1, 3, 7, 9, 2 };
		quickSort(ar);
	}
}
