package asssingmentfeb07;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] bbarr = new int[n];
		for (int i = 0; i < n; i++) {
			bbarr[i] = sc.nextInt();

		}
		int[] isarr = new int[n];

		for (int i = 0; i < n; i++) {
			isarr[i] = sc.nextInt();

		}
		int[] ssarr = new int[n];

		for (int i = 0; i < n; i++) {
			ssarr[i] = sc.nextInt();

		}


		 BubbleSort(bbarr);
		 InsertionSort(isarr);
		SelectionSort(ssarr);

	}

	public static void ArrayDisplay(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	public static void BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp;
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		ArrayDisplay(arr);

	}

	public static void InsertionSort(int[] arr) {
		System.out.println();
		int i = 0;
		int temp = 0;
		for (int j = i + 1; j < arr.length; j++) {
			i = j - 1;
			temp = arr[j];
			while (i >= 0) {

				if (temp > arr[i]) {

					arr[i + 1] = arr[i];
					i--;

				} else {
					break;
				}

			}

			arr[i + 1] = temp;
		}
		ArrayDisplay(arr);
	}

	public static void SelectionSort(int[] arr) {
		System.out.println();
		int s = 0;
		int in = 0;
		int i, min = arr[0];
		while (s < arr.length)

		{
			min = arr[s];
			in = s;
			for (i = s; i < arr.length; i++) {

				if (min > arr[i]) {
					in = i;
					min = arr[i];

				}

			}
			int temp = arr[s];
			arr[s] = min;
			arr[in] = temp;
			s++;
		}
		ArrayDisplay(arr);
	}

}
