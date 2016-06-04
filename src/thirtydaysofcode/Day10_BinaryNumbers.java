package thirtydaysofcode;

import java.util.Scanner;

public class Day10_BinaryNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int decimalNumber = in.nextInt();
		in.close();
		// easier approach
		// String binaryNumber = Integer.toBinaryString(test); //but the leading
		// 0s are eliminated from the output

		StringBuffer sb = new StringBuffer();
		int rem = 0;
		while (decimalNumber > 0) {
			rem = decimalNumber % 2;
			sb.append(rem);
			decimalNumber = decimalNumber / 2;
		}
		// System.out.println(sb.reverse().toString());
		String binaryNumber = sb.reverse().toString();
		int count = 0, max = 0;
		for (int i = 0; i < binaryNumber.length(); i++) {
			if (binaryNumber.charAt(i) == '1') {
				count++;
				if (count > max) {
					max = count;
				}
			} else {
				if (count > max) {
					max = count;
				}
				count = 0;
			}
		}
		System.out.println(max);
	}

}
