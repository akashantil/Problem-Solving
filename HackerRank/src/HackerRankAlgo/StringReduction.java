package HackerRankAlgo;

import java.util.Scanner;
import java.util.Stack;

public class StringReduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();

		Stack<Character> st = new Stack<Character>();
		Stack<Character> st2 = new Stack<Character>();
		int i = 0;

		while (i <= s.length() - 1) {

			if (st.isEmpty() == true) {
				st.push(s.charAt(i));
				i++;
			} else if (st.peek() == s.charAt(i)) {
				st.pop();
				i++;
			} else {
				st.push(s.charAt(i));
				i++;
			}

		}
		if (st.isEmpty() == false) {

			while(!st.isEmpty()) {
				char x = st.pop();
				st2.push(x);
			}
		}
		
		
		if (st2.isEmpty() == true) {
			System.out.println("Empty String");
		} else {
			while(!st2.isEmpty()) {
				char c = st2.pop();
				System.out.print(c);
			}
		}
	}

}
