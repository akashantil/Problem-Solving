package C2July12;

import java.util.Scanner;

public class SearchInSortedAndRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int k = 0; k < not; k++) {
			int soa = sc.nextInt();
			int[] arr = new int[soa];
			for (int i = 0; i < soa; i++)
				arr[i] = sc.nextInt();
			int key = sc.nextInt();

			int idx = 0;

			int pi = findPivot(arr, 0, arr.length - 1);
			if (pi == -1) {
				idx = ModifiedBinarySearch(arr, key, 0, arr.length - 1);
				if (idx > 0)
					System.out.println(idx);
				else
					System.out.println("OOPS! NOT FOUND");

			}

			else {
				idx = ModifiedBinarySearch(arr, key, 0, pi);
				if (idx > 0)
					System.out.println(idx);
				else {
					idx = ModifiedBinarySearch(arr, key, pi, arr.length - 1);
					if (idx > 0)
						System.out.println(idx);
					else {
						System.out.println("OOPS! NOT FOUND");
						return;
					}
				}

			}
		}

	}

	public static int findPivot(int[] arr, int low, int high) {

		int mid = (low + high) / 2;
		if (high < low)
			return -1;
		if (high == low)
			return low;

		if (mid < high && arr[mid] > arr[mid + 1])
			return mid;
		if (mid > low && arr[mid] < arr[mid - 1])
			return mid;
		if (arr[low] >= arr[mid])
			return findPivot(arr, low, mid - 1);
		return findPivot(arr, mid + 1, high);

	}

	public static int ModifiedBinarySearch(int[] arr, int key, int lo, int hi) {

		if (hi < lo)
			return -1;

		int mid = (lo + hi) / 2;

		if (arr[mid] == key)
			return mid;

		else if (arr[mid] > key)
			return ModifiedBinarySearch(arr, key, lo, mid - 1);
		else
			return ModifiedBinarySearch(arr, key, mid + 1, hi);

	}

}
