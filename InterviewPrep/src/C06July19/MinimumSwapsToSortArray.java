package C06July19;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwapsToSortArray {

	// public static class Pair {
	// int data;
	// int di;
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int[] temp = new int[soa];
		for (int i = 0; i < soa; i++)
			temp[i] = arr[i];

		Arrays.sort(temp);
		int[] index = new int[soa];

		// otherwise put array in hashmap and
		// find desired index in o(1) to make it run in o(n)
		for (int i = 0; i < soa; i++) {

			index[i] = Arrays.binarySearch(temp, arr[i]);

		}

		int mnos = 0;
		for (int i = 0; i < soa; i++) {
			while (index[i] != i) {
				mnos++;
				int temp1 = arr[i];
				arr[i] = arr[index[i]];
				arr[index[i]] = temp1;

				temp1 = index[i];
				index[i] = index[index[i]];
				index[temp1] = temp1;

			}

		}
		System.out.println(mnos);

	}

}
