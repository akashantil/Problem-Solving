package C2July12;

import java.util.Scanner;

public class RearrangePositiveAndNegativeInaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int low = 0;
		int mid = 0;

		while (mid < soa) {
			if (arr[mid] >= 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;

				low++;
				mid++;

			} else {
				mid++;
			}
		}

		for (int i = 1; i < soa && low < soa && low != 0; i += 2) {

			int temp = arr[i];
			arr[i] = arr[low];
			arr[low] = temp;

			low++;

		}

		for (int i = 0; i < soa; i++)
			System.out.print(arr[i] + " ");

	}

}
