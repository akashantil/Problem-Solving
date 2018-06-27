package C05July18;

import java.util.Scanner;

public class Ceiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();
		if (arr[soa - 1] < k) {
			System.out.println("There is no ceiling");
			return;
		} else if (arr[0] > k) {
			System.out.println(arr[0]);
			return;
		} else if (arr[soa - 1] == k) {
			System.out.println(arr[soa - 1]);
			return;
		} else {

			System.out.println(solve(k, arr, 0, soa - 1));

		}

	}

	public static int solve(int k, int[] arr, int lo, int hi) {

		if (lo < hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == k)
				return arr[mid];

			else if (arr[mid] > k && mid != 0 && arr[mid - 1] < k)
				return arr[mid];
			else if (arr[mid] < k && mid != arr.length - 1 && arr[mid + 1] > k) {
				return arr[mid + 1];

			} else if (arr[mid] > k)
				return solve(k, arr, lo, mid - 1);
			else if (arr[mid] < k)
				return solve(k, arr, mid + 1, hi);

		}

		return -1;

	}

}
