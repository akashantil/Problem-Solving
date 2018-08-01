package DpAndGreedy.Class1;

import java.util.Scanner;

public class MaxSumBitonicSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		int[] lis = new int[soa];
		int[] lds = new int[soa];

		lis[0] = arr[0];
		lds[soa - 1] = arr[soa - 1];

		for (int i = 1; i < soa; i++) {
			lis[i] = arr[i];
			for (int j = i - 1; j >= 0; j--) {

				if (arr[j] < arr[i]) {
					lis[i] = Math.max(lis[i], arr[i] + lis[j]);
				}
			}

		}

		for (int i = soa - 1; i >= 0; i--) {
			lds[i] = arr[i];
			for (int j = i + 1; j < soa; j++) {
				if (arr[j] < arr[i]) {
					lds[i] = Math.max(lds[i], arr[i] + lds[j]);
				}

			}
		}

		int maxSum = 1;
		for (int i = 0; i < soa; i++) {
			if (lds[i] + lis[i] - arr[i] > maxSum)
				maxSum = lds[i] + lis[i] - arr[i];

		}
		System.out.println(maxSum);

	}

}
