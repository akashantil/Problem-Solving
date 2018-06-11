package OrderAndStats;

import java.util.Scanner;

public class KlargestON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int k = sc.nextInt();

		int x = kth(arr, 0, arr.length - 1, k);

		if (x > 0) {
			for (int i = x; i < arr.length; i++)
				System.out.print(arr[i] + " ");
		} else
			System.out.println(-1);
	}

	public static int kth(int[] arr, int low, int high, int k) {

		int pivot = qspartition(arr, low, high);

		if (pivot < arr.length - k) {
			return kth(arr, pivot + 1, high, k);
		} else if (pivot > arr.length - k)
			return kth(arr, low, pivot - 1, k);
		else if (pivot == arr.length - k) {

			return pivot;
		}

		return -1;

	}

	public static int qspartition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low - 1;

		int j = low;
		while (j < high) {
			if (arr[j] <= pivot) {
				// increment i and swap
				i++;

				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;

			}
			j++;
		}
		// swap[i+1] and high
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;

	}

}
