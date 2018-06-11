package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class NextGreateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			if (i == 0)
				s.push(arr[i]);
			else {
				int top = s.peek();
				if (arr[i] < top)
					s.push(arr[i]);
				else {
					while (true && !s.isEmpty()) {
						int x = s.pop();

						if (arr[i] > x) {

							System.out.println(x + " --> " + arr[i]);

						} else
							break;
					}
					s.push(arr[i]);

				}

			}
		}
		while (!s.isEmpty()) {
			int x = s.pop();
			System.out.println(x + " --> " + "-1");

		}
	}

}
