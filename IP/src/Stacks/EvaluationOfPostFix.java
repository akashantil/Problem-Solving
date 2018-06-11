package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class EvaluationOfPostFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		
		System.out.println(solve(inp));

	}

	public static int solve(String ques) {

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			if (ch >= '0' && ch <= '9') {

				st.push(ch - '0');

			} else {
				int x = st.pop();
				int y = st.pop();
				switch (ch) {

				case '+':
					st.push(x + y);
					break;
				case '*':
					st.push(x * y);
					break;

				case '-':
					st.push(y - x);
					break;

				case '/':
					st.push(y / x);
					break;

				}
			}

		}
		
		return st.peek();

	}

}
