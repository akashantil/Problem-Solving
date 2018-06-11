package SearchingAndSorting;

import java.util.Arrays;

public class SAS_50UnionAndIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 7, 1, 5, 2, 3, 6 };
		int arr2[] = { 3, 8, 6, 20, 7 };

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int[] union = new int[arr1.length + arr2.length];
		int[] intersection = new int[Math.min(arr1.length, arr2.length)];

		int u = 0;
		int in = 0;

		int i = 0;

		while (i < arr1.length - 1) {
			if (arr1[i] != arr1[i + 1]) {
				int idx = bs(0, arr2.length, arr2, arr1[i]);
				if (idx >= 0) {
					union[u] = arr1[i];
					arr2[idx] = -1;
					intersection[in] = arr1[i];
					u++;
					in++;
				} else {
					union[u] = arr1[i];
					u++;
				}

			}
			i++;

		}
		int idx = bs(0, arr2.length, arr2, arr1[arr1.length - 1]);
		if (idx >= 0) {
			union[u] = arr1[i];
			arr2[idx] = -1;
			intersection[in] = arr1[i];
			u++;
			in++;
		} else {
			union[u] = arr1[i];
			u++;
		}

		for (int k = 0; k < arr2.length; k++) {
			if (arr2[k] != -1) {
				union[u] = arr2[k];
				u++;
			}
		}
		for (int i1 = 0; i1 < union.length; i1++) {
			if (union[i1] != 0)
				System.out.print(union[i1] + " ");

		}
		System.out.println();
		for (int i1 = 0; i1 < intersection.length; i1++) {
			if (intersection[i1] != 0)
				System.out.print(intersection[i1] + " ");

		}

	}

	public static int bs(int l, int h, int[] arr, int x) {

		if (l <= h) {
			int mid = (l + h) / 2;

			if (arr[mid] == x) {
				return mid;

			} else if (arr[mid] > x) {
				return bs(l, mid - 1, arr, x);
			} else {
				return bs(mid + 1, h, arr, x);
			}
		}
		return -1;
	}

}
