package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeTheMaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		Arrays.sort(arr);
		int k = sc.nextInt();
		int low = arr[0] + k;
		int high = arr[arr.length - 1] - k;

		if (high < low) {
			int temp = low;
			low = high;
			high = temp;
		}

		for (int i = 1; i < arr.length - 1; i++) {

			int sub = arr[i] - k;
			int newSmallS = sub < low ? sub : low;
			int newBigS = high;

			int add = arr[i] + k;
			int newSmallA = low;
			int newBigA = add > high ? add : high;

			if (newBigS - newSmallS < newBigA - newSmallA) {
				low = newSmallS;
				high = newBigS;
			} else {
				low = newSmallA;
				high = newBigA;
			}

		}
		System.out.println(Math.min(high-low, arr[arr.length - 1] - arr[0]));

	}

}
