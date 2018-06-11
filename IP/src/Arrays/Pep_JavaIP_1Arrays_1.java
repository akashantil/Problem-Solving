package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		long k = sc.nextLong();
		long[] arr = new long[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextLong();

		}
		long res = result(arr, k);
		System.out.println(res);

	}

	public static long rec(long[] arr) {

		long sum = Integer.MIN_VALUE;
		long fsum = Integer.MIN_VALUE;
		boolean winner = false;

		if (arr[0] >= 0) {
			sum = arr[0];

			winner = true;

		} else {
			sum = arr[0];

		}
		if (sum > fsum) {
			fsum = sum;

		}

		for (int i = 1; i < arr.length; i++) {

			if (winner == true) {
				sum += arr[i];

			}

			else if (winner == false && arr[i] > 0) {

				sum = arr[i];

			} else if (winner == false && arr[i] < 0) {
				sum = arr[i];

			}
			if (sum > fsum) {
				fsum = sum;

			}
			if (sum > 0)
				winner = true;
			else
				winner = false;

		}

		return fsum;

	}

	public static long sum(long[] arr) {

		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;

	}

	public static long result(long[] arr, long k) {

		long fsum = 0;
		long[] tempo = new long[arr.length * 2];
		for (int i = 0; i < tempo.length; i++) {
			tempo[i] = arr[i % arr.length];
		}

		long sumofarr = sum(arr);

		if (sumofarr >= 0) {

			long ressum = sumofarr * (k - 2);

			
			
			long secsum = rec(tempo);

			fsum = ressum + secsum;

		} else {
			fsum = rec(tempo);
		}

		return fsum;
	}

}
