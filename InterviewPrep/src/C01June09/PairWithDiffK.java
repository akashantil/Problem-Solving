package July9;

import java.util.Arrays;
import java.util.Scanner;

public class PairWithDiffK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		int tar = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		int i = 0;
		int j = 1;
		boolean found = false;

		while (j < arr.length) {
			int diff = arr[j] - arr[i];
			if (diff < tar)
				j++;
			else if (diff > tar)
				i++;
			else {
				if (i != j) {
					found = true;
					System.out.println(arr[i] + " " + arr[j]);
					j++;
				}
				else
					j++;

			}
		}
		if (found == false) {
			System.out.println(-1);
		}

	}

}
