package SearchingAndSorting;

import java.util.Arrays;

public class SAS_32QuarupleEqualToTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 2, 3, 4, 5, 9, 7, 8 };
		Arrays.sort(arr);

		quad(arr, 23);

	}

	public static void quad(int[] arr, int ts) {

		int i = 0;
		int j = 1;
		int k = arr.length - 2;
		int l = arr.length - 1;
		while (i < l) {
			int sum = arr[i] + arr[j] + arr[k] + arr[l];
			if (j + 1 <= k) {
				if (sum > ts) {
					k--;
				} else if (sum < ts)
					j++;
				else {
					System.out.println(
							"Quadruple is " + arr[i] + " + " + arr[j] + " + " + arr[k] + " + " + arr[l] + " = " + ts);
					return;
				}
			} else {
				i++;
				j = i + 1;
				l--;
				k = l - 1;

			}

		}
		System.out.println("No Such QuadRuple Exist");

	}

}
