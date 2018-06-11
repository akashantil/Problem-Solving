package Arrays;

import java.util.Scanner;

public class StockBuySellAtmost2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		int[] left = new int[soa];
		int[] right = new int[soa];

		right[soa - 1] = 0;
		left[0] = 0;
		int maxsofar = arr[soa - 1];
		int minsofar = arr[0];
		for (int i = soa - 2; i >= 0; i--) {

			if (arr[i] > maxsofar)
				maxsofar = arr[i];

			else
				right[i] = Math.max(maxsofar - arr[i], right[i + 1]);
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minsofar)
				minsofar = arr[i];
			else {
				left[i] = Math.max(left[i - 1], arr[i] - minsofar);
			}

		}
		int maxprofit = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (right[i] + left[i] > maxprofit)
				maxprofit = right[i] + left[i];
		}
		System.out.println(maxprofit);

	}

}
