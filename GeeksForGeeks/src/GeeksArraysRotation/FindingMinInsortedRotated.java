package GeeksArraysRotation;

import java.util.Scanner;

public class FindingMinInsortedRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int start = 0;
		int end = arr.length - 1;

		int i = KindaBS(arr, start, end);
		System.out.println(i);

	}

	public static int KindaBS(int[] arr, int start, int end) {
		int mid = (start + end) / 2;
		if (arr[start] < arr[end]) {
			return arr[0];
		}
		if (start == end)
			return arr[start];
		if (mid < end && arr[mid + 1] < arr[mid]) {
			return arr[mid + 1];

		}
		if (mid > start && arr[mid] < arr[mid - 1])
			return arr[mid];

		if (arr[end] > arr[mid])
			return KindaBS(arr, start, mid - 1);

		return KindaBS(arr, mid + 1, end);
	}

}
