package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sos = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < sos; i++) {
			st.push(sc.nextInt());

		}
		find(st);
		print(st);

	}

	public static void find(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;

		}

		int temp = st.pop();
		find(st);

		solve(st, temp);

	}

	public static void solve(Stack<Integer> st, int temp) {

		if (st.isEmpty() || temp > st.peek()) {
			st.push(temp);
			return;
		} else {

			int temp2 = st.pop();
			solve(st, temp);
			st.push(temp2);

		}

	}

	public static void print(Stack<Integer> st) {
		while (st.isEmpty() == false) {
			int temp = st.pop();
			System.out.print(temp + " ");
		}
	}

}
