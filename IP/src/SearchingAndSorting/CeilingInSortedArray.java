package temp;

import java.util.Scanner;

public class CeilingInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();

		}
		int x = sc.nextInt();
		int idx = modifiedBs(arr, 0, arr.length - 1, x);
		if (idx == -1)
			System.out.println("No Ceil Found");
		else
			System.out.println(arr[idx
			                       ]);

	}

	public static int modifiedBs(int[] arr, int lo, int hi, int x) {
		if(x>arr[arr.length-1])
			return -1;
		if(lo==hi)
			return lo;
		

		if (lo <=hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == x)
				return mid;
			else if (arr[mid] > x && mid != 0) {
				if (arr[mid - 1] < x)
					return mid;
				else
					return modifiedBs(arr, lo, mid - 1, x);

			} else if (arr[mid] < x && mid != arr.length - 1) {
				if (arr[mid + 1] > x)
					return mid+1;
				else
					return modifiedBs(arr, mid + 1, hi, x);

			}

		}
		return -1;
	}

}
