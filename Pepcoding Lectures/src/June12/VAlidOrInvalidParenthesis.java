package June12;

import java.util.Stack;

public class VAlidOrInvalidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it returns true if ans has duplicate parenthesis
		// it returns false if ans doesn't have duplicate parenthesis

		String ans = "((((a+b)+(c+d)))+(e+f))";

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < ans.length(); i++) {

			char ch = ans.charAt(i);

			if (ch != ')')
				st.push(ch);
			else {
				if (st.peek() == '(') {
					System.out.println(true);
					return;
				} else {
					while (st.peek() != '(')
						st.pop();

					st.pop();
				}
			}

		}
		System.out.println(false);

	}

}
