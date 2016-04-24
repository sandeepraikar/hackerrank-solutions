package algorithms.misc;

import java.util.Scanner;
import java.util.Stack;

public class ValidatingParanthesis {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		Stack<Character> stack = new Stack<>();
		boolean result = true;
		for (int i = 0; i < t; i++) {
			stack.clear();
			String item = in.next();
			for (int j = 0; j < item.length(); j++) {

				char x = item.charAt(j);
				if (x == '{' || x == '[' || x == '<' || x == '(') {
					stack.push(x);
				} else {
					if (!stack.isEmpty()) {
						if (stack.peek() == '{' && x == '}'
								|| stack.peek() == '[' && x == ']'
								|| stack.peek() == '<' && x == '>'
								|| stack.peek() == '(' && x == ')') {
							stack.pop();
						} else {
							result = false;
						}
					} else {
						result = false;
					}
				}
			}
			if (stack.empty() && result == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
		in.close();
	}
}