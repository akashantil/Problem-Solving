package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class StackPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		int[] arr1 = new int[soa];
		int[] arr2 = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < soa; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println(solve(arr1, arr2));

	}

	public static boolean solve(int[] arr1, int[] arr2) {

		int idx1 = 0;
		int idx2 = 0;

		Stack<Integer> st = new Stack<>();

		while (idx1 < arr1.length) {

			if (arr1[idx1] == arr2[idx2]) {
				idx1++;
				idx2++;
			} else if (st.isEmpty() && arr1[idx1] != arr2[idx2]) {
				st.push(arr1[idx1]);
				idx1++;

			} else {
				int x = st.peek();
				if (x != arr2[idx2] )
				{
					st.push(arr1[idx1]);
					idx1++;
				}
				else {
					st.pop();
					idx2++;
				}
			}

		}
		if (idx1 == arr1.length && st.isEmpty() && idx2 == arr2.length)
			return true;
		else if (idx1 == arr1.length && st.isEmpty() == false) {
			while (!st.isEmpty()) {
				int x = st.pop();
				if (arr2[idx2] != x)
					return false;
				else{
					idx2++;
				}

			}
			return true;

		}

		return false;

	}

}
