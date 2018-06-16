package C2July12;

import java.util.Scanner;

public class BuySell2times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int[] right = new int[soa];
		int[] left = new int[soa];
		int maxsofar = arr[soa - 1];
		int minsofar = arr[0];

		left[0] = 0;
		right[soa - 1] = 0;

		for (int i = soa - 2; i >= 0; i--) {
			if (arr[i] > maxsofar)
				maxsofar = arr[i];

			right[i] = Math.max(right[i + 1], maxsofar - arr[i]);
		}

		for (int i = 1; i < soa; i++) {
			if (arr[i] < minsofar)
				minsofar = arr[i];

			left[i] = Math.max(left[i - 1], arr[i] - minsofar);

		}

		int omax = 0;
		for (int i = 0; i < soa; i++) {
			if (left[i] + right[i] > omax)
				omax = left[i] + right[i];

		}
		System.out.println(omax);
	}

}
