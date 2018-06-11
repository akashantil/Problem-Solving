package Arrays;

import java.util.Scanner;

public class MaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		int[] maxdiff = new int[soa];
		int[] minsofar = new int[soa];

		maxdiff[0] = 0;
		;
		minsofar[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > minsofar[i - 1]) {
				maxdiff[i] = Math.max(maxdiff[i - 1], arr[i] - minsofar[i - 1]);
				minsofar[i] = minsofar[i - 1];
			} else {
				if (arr[i] < minsofar[i - 1]) {

					maxdiff[i] = maxdiff[i - 1];
					minsofar[i] = arr[i];
				}
			}

		}
		System.out.println(maxdiff[arr.length - 1]);

	}

}
