package C2July12;

import java.util.Scanner;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int k = 0; k < not; k++) {
			int soa = sc.nextInt();
			int[] arr = new int[soa];
			for (int i = 0; i < soa; i++)
				arr[i] = sc.nextInt();
			// make it work it need some time

			// int peak = Integer.MIN_VALUE;
			// int peakIn = 0;
			// int waterCollected = 0;
			//
			// for (int i = 0; i < soa; i++)
			// if (arr[i] > peak) {
			// peak = arr[i];
			// peakIn = i;
			// }
			//
			// for (int i = 0; i < peakIn; i++)
			// waterCollected += peak - arr[i];
			//
			// for (int j = soa - 1; j <= peakIn; j--)
			// waterCollected += peak - arr[j];
			//
			// System.out.println(waterCollected);

			int[] left = new int[soa];
			int[] right = new int[soa];
			left[0] = arr[0];
			right[soa - 1] = arr[soa - 1];

			for (int i = 1; i < soa; i++)
				left[i] = Math.max(arr[i], left[i - 1]);
			for (int i = soa - 2; i >= 0; i--)
				right[i] = Math.max(arr[i], right[i + 1]);

			int water = 0;
			for (int i = 0; i < arr.length; i++) {
				int min = Math.min(left[i], right[i]);
				water += min - arr[i];
			}
			System.out.println(water);

		}
	}

}
