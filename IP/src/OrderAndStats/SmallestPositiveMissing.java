package OrderAndStats;

import java.util.Scanner;

public class SmallestPositiveMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int i = 0;
		int j = 0;
		while (j < arr.length) {
			if (arr[j] < 0) {
				int temp = arr[i];
				arr[i] = 10;
				arr[j] = temp;
				i++;
			}
			j++;

		}
		while (i < arr.length) {
			int idx = Math.abs(arr[i]);
			if (idx - 1 < arr.length)
				arr[idx - 1] *= -1;

			i++;
		}

		for (int i1 = 0; i1 < arr.length; i1++) {
			if (arr[i1] > 0) {
				System.out.println(i1 + 1);
				return;

			}
		}

	}

}
