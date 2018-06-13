package June12;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ans = "[{(a+b)+c}+d]]]]";

		System.out.println(check(ans));

	}

	public static boolean check(String ans) {
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < ans.length(); i++) {

			char ch = ans.charAt(i);
			if (st.isEmpty() && (ch == ')' || ch == '}' || ch == ']'))
				return false;

			if (ch == '(' || ch == '{' || ch == '[')
				st.push(ch);
			else if (ch == ')') {
				if (st.peek() == '(')
					st.pop();
				else
					return false;
			} else if (ch == '}') {
				if (st.peek() == '{')
					st.pop();
				else
					return false;
			} else if (ch == ']') {
				if (st.peek() == '[')
					st.pop();
				else
					return false;
			}
		}
		if (!st.isEmpty())
			return false;
		else

			return true;
	}

}
