package Arrays;

import java.util.Scanner;

public class GenerateAllSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa1 = sc.nextInt();
		int[] arr1 = new int[soa1];
		for (int i = 0; i < soa1; i++)
			arr1[i] = sc.nextInt();

		int soa2 = sc.nextInt();
		int[] arr2 = new int[soa2];
		for (int i = 0; i < soa2; i++)
			arr2[i] = sc.nextInt();

		int[] farr = new int[arr1.length + arr2.length];

		solve(arr1, arr2, farr, true, 0, 0, 0, 0);
	}

	public static void solve(int[] a, int[] b, int[] c, boolean flag, int len, int idx, int i, int j) {

		if (flag == true) {
			if (len != 0)
				print(c, len);
			for (int k = i; k < a.length; k++) {
				if (len == 0) {
					c[len] = a[k];
					solve(a, b, c, !flag, len, idx, k + 1, j);
				} else if (a[k] > c[len]) {
					c[len + 1] = a[k];
					solve(a, b, c, !flag, len + 1, idx, k + 1, j);
				}
			}
		} else {
			for (int l = j; l < b.length; l++) {
				if (b[l] > c[len]) {
					c[len + 1] = b[l];
					solve(a, b, c, !flag, len + 1, idx, i, l + 1);
				}
			}
		}

	}

	private static void print(int[] farr, int idx) {
		for (int i = 0; i <= idx; i++)
			System.out.print(farr[i] + " ");
		System.out.println();

		// TODO Auto-generated method stub

	}

}
