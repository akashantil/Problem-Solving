package GeeksArraysRotation;

import java.util.Scanner;

public class RotationcountinSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		int maxi = 0;
		int maxe = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > maxe) {
				maxe = arr[i];
				maxi = i;
			}
			if (maxi != arr.length - 1) {
				count = maxi + 1;

			} else {
				count = 0;
			}

		}
		System.out.println(count);
		

	}
}
