package Strings;

import java.util.Scanner;

public class NextGreaterPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		// count no of digits
		int soa = 0;
		int temp = no;
		while (temp > 0) {

			temp /= 10;
			soa++;

		}
		int[] arr = new int[soa];
		int j = arr.length - 1;

		while (no > 0) {

			int rem = no % 10;
			arr[j] = rem;
			no /= 10;
			j--;

		}

		j = arr.length - 1;
		while (j > 0) {
			int prev = j - 1;
			if (arr[j] > arr[prev])
				break;

			j--;
		}
		int diff = Integer.MAX_VALUE;
		int idx = 0;
		if (j != 0) {
			for (int k = j; k < arr.length; k++) {
				if (arr[k] > arr[j - 1]) {
					if (arr[k] - arr[j - 1] < diff) {
						diff = arr[k] - arr[j - 1];
						idx = k;
					}

				}

			}
			temp = arr[idx];
			arr[idx] = arr[j - 1];
			arr[j - 1] = temp;

			int end = arr.length - 1;
			while (j < end) {
				temp = arr[end];
				arr[end] = arr[j];
				arr[j] = temp;

				end--;
				j++;

			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "");
			}
		} else {
			int st = 0;
			int en = arr.length - 1;

			while (st < en) {
				temp = arr[en];
				arr[en] = arr[st];
				arr[st] = temp;

				en--;
				st++;

			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "");
			}

		}

	}

}
