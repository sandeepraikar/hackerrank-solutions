package algorithms.misc;

import java.util.Scanner;

public class ReducingFraction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int denom1 = in.nextInt();
		int num2 = in.nextInt();
		int denom2 = in.nextInt();

		in.close();
		int denom = denom1 * denom2;
		int num = num1 * denom2 + num2 * denom1;

		int gcd = calculateGCD(num, denom);
		num = num / gcd;
		denom = denom / gcd;

		System.out.println("Reduced Fraction : " + num + "/" + denom);
	}

	private static int calculateGCD(int num, int denom) {
		while (denom != 0) {
			int temp = denom;
			denom = num % denom;
			num = temp;
		}
		return num;
	}

}
