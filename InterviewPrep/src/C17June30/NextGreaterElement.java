package C16June30;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < soa; i++) {
			if (st.isEmpty()) {
				st.push(arr[i]);
			} else {

				int currele = arr[i];
				while (!st.isEmpty() && currele > st.peek()) {
					int x = st.pop();
					System.out.println(x + " --> " + currele);
				}
				st.push(currele);
			}
		}
		while (!st.isEmpty()) {
			System.out.println(st.pop() + " -- " + "-1");
		}

	}

}
