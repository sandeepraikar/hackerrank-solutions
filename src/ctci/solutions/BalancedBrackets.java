package ctci.solutions;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in); int t = in.nextInt(); for (int
		 * a0 = 0; a0 < t; a0++) { String expression = in.next();
		 * System.out.println((isBalanced(expression)) ? "YES" : "NO"); }
		 */
		String expression = "[{(})}]";
		System.out.println((isBalanced_v2(expression)) ? "YES" : "NO");

	}

	// optimized version
	public static boolean isBalanced_v2(String expression) {
		Stack<Character> stack = new Stack<>();
		if ((expression.length() & 1) == 1)
			return false;
		else {
			
			for (char bracket : expression.toCharArray()) {
				switch(bracket){
				case '{': stack.push('}');
				case '[': stack.push(']');
				case '(': stack.push(')');
				default :
					if(stack.isEmpty() || stack.peek()!=bracket){
						return false;
					}else{
						stack.pop();
					}
				}
			}
		}
		return stack.empty();
	}

	public static boolean isBalanced(String expression) {
		boolean result = true;
		Stack<Character> bracketStack = new Stack<>();

		for (char c : expression.toCharArray()) {
			if (c == '{' || c == '[' || c == '(') {
				bracketStack.push(c);
			} else {
				if (!bracketStack.isEmpty()) {
					char top = bracketStack.peek();
					if ((top == '{' && c == '}') || (top == '[' && c == ']')
							|| (top == '(' && c == ')')) {
						bracketStack.pop();
					} else {
						result = false;
						break;
					}
				} else {
					result = false;
					break;
				}
			}
		}
		return result;
	}

}
