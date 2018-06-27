package July9;

import java.util.Scanner;

public class KConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		int k = sc.nextInt();

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		if (k == 1) {
			System.out.println(kadanesSum(arr));
		}

		int[] temp = new int[arr.length * 2];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i % arr.length];
		}
		long ksum = kadanesSum(temp);

		int roas = sum(arr);
		long msss = 0;
		if (roas > 0) {
			msss = roas * (k - 2);
			msss += ksum;
			System.out.println(msss);

		} else {
			System.out.println(ksum);
		}

	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static long kadanesSum(int[] arr) {
		long os = Integer.MIN_VALUE;
		long cs = 0;

		boolean winner = false;

		for (int i = 0; i < arr.length; i++) {

			if (winner == false && arr[i] >= 0) {
				cs = arr[i];
				winner = true;
			} else if (winner == false && arr[i] < 0)
				cs = arr[i];

			else if (winner == true && arr[i] < 0) {
				cs += arr[i];

			} else if (winner == true && arr[i] >= 0)
				cs += arr[i];

			if (cs >= 0)
				winner = true;
			else
				winner = false;

			if (cs > os) {
				os = cs;

			}

		}

		return os;

	}

}
