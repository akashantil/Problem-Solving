package GeeksArraysArrangements;

import java.util.Scanner;

public class MaxMinOrderOf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// order of 1 technique

		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		int minidx = 0;
		int maxidx = n - 1;
		int maxele = arr[maxidx] + 1;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				arr[i] += ((arr[maxidx] % maxele) * maxele);
				maxidx--;
			} else {
				arr[i] += ((arr[minidx] % maxele) * maxele);
				minidx++;
			}
		}
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] / maxele;
			System.out.print(arr[i] + " ");
		}
	}

}
