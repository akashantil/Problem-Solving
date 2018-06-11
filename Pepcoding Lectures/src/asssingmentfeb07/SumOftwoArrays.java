package asssingmentfeb07;

import java.util.Scanner;

public class SumOftwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int m;
		m = sc.nextInt();

		int[] arr1 = new int[m];
		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();

		}

		int[] sum = new int[(Math.max(n, m)) + 1];

		int c = 0;
		int l = sum.length - 1;
		int i = n - 1;
		int j = m - 1;
		while (l >= 0) {

			if (i >= 0 && j >= 0) {
				sum[l] = (arr[i] + arr1[j] + c);
				c = sum[l] / 10;
				sum[l] %= 10;

				i--;
				j--;
				l--;
			} else if (i < 0 && j >= 0) {
				sum[l] = (arr1[j] + c);
				c = sum[l] / 10;
				sum[l] %= 10;

				i--;
				j--;
				l--;
			} else if (i >= 0 && j < 0) {
				sum[l] = (arr[i] + c);
				c = sum[l] / 10;
				sum[l] %= 10;

				i--;
				j--;
				l--;
			} else {
				sum[l] = c;
				l--;
			}

		}
		if (sum[0] == 0) {
			for (int i1 = 1; i1 < sum.length; i1++) {

				System.out.print(sum[i1] + " ");

			}
		} else {
			for (int i1 = 0; i1 < sum.length; i1++) {
				System.out.print(sum[i1] + " ");
			}
		}

	}

}
