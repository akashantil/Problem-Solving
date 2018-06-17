package C2July12;

import java.util.Scanner;

public class PairSuminSortedAndRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soaa = sc.nextInt();
		int[] arr = new int[soaa];
		for (int i = 0; i < soaa; i++)
			arr[i] = sc.nextInt();
		int target = sc.nextInt();

		int pi = findPivot(arr, 0, arr.length - 1);
		findpair(arr, pi + 1, pi, target);

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
			return mid-1;
		if (arr[low] >= arr[mid])
			return findPivot(arr, low, mid - 1);
		return findPivot(arr, mid + 1, high);

	}

	public static void findpair(int[] arr, int low, int high, int target) {

		int i = low;
		int j = high;

		while (j != i) {
			int sum = arr[i] + arr[j];
			if (sum > target)

				if (j - 1 != -1)
					j = (j - 1) % arr.length;
				else
					j = arr.length - 1;

			else if (sum < target)
				if (i + 1 != arr.length)
					i = (i + 1) % arr.length;
				else
					i = 0;

			else {
				System.out.println(arr[i] + " " + arr[j]);
				if (j - 1 != -1)
					j = (j - 1) % arr.length;
				else
					j = arr.length - 1;

			}

		}

	}

}
