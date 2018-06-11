package GeeksArraysArrangements;

import java.util.Scanner;

public class largestequalSubarray0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this one also tells the array with equal no of zero and 1 but is
		// O(n^2)

		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int c0 = 0;
		int sum = 0;
		int c1 = 0;
		int si = 0;
		int ei = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			sum = 0;
			c0 = 0;
			c1 = 0;

			for (int j = i; j < n; j++) {
				if (arr[j] == 0) {
					c0++;
				} else if (arr[j] == 1) {
					c1++;
					sum++;
				}
				

				if (c0 == c1 && sum > max) {
					si = i;
					ei = j;
					max = sum;
				}

			}

		}
		System.out.print("Max subArray is of size " + 2*max + "  ");
		System.out.println();
		for (int i = si; i <= ei; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
