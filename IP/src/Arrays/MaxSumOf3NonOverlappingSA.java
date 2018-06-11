package Arrays;

import java.util.Scanner;

public class MaxSumOf3NonOverlappingSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		int ws = sc.nextInt();

		int[] left = new int[arr.length];
		int[] right = new int[arr.length];

		for (int i = ws - 1; i <= arr.length - 1; i++) {

			for (int j = i, count = ws; count > 0; j--, count--) {
				left[i] += arr[j];
			}
			left[i] = Math.max(left[i], left[i - 1]);

		}

		for (int i = arr.length - ws; i >= 0; i--) {

			for (int j = i, count = ws; count > 0; j++, count--) {
				right[i] += arr[j];
			}
			right[i] = Math.max(right[i], right[i + 1]);

		}
		System.out.println(sum(arr, left, right, ws));

		// O(n^2)working
		// int maxSum = Integer.MIN_VALUE;
		//
		// for (int i = ws; i < arr.length - ws; i++) {
		// int count = ws;
		// int sum = 0;
		// int idx = i;
		// while (count > 0) {
		// sum += arr[idx];
		// idx++;
		//
		// count--;
		// }
		// if (sum + left[i - 1] + right[i + ws] > maxSum)
		// maxSum = sum + left[i - 1] + right[i + ws];
		//
		// }
		//
		// System.out.println(maxSum);

	}

	public static int sum(int[] arr, int[] left, int[] right, int ws) {

		// O(N) ->Working
		int msf = Integer.MIN_VALUE;
		int wsum = 0;
		int csum = 0;
		for (int i = ws; i < 2 * ws; i++)
			wsum += arr[i];

		csum = wsum + left[ws - 1] + right[2 * ws];
		if (csum > msf)
			msf = csum;

		int i = ws;
		int j = 2 * ws;

		while (j < arr.length - ws) {
			wsum = wsum - arr[i] + arr[j];

			csum = wsum + left[i] + right[j + 1];

			if (csum > msf)
				msf = csum;
			j++;
			i++;

		}

		return msf;

	}

}
