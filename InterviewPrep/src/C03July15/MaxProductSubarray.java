package MissedClassJune14;

import java.util.Scanner;

public class MaxProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int max = arr[0];
		int min = arr[0];
		int ovmax = arr[0];

		for (int i = 1; i < soa; i++) {
			if (arr[i] != 0) {
				int temp=max;
				max = Math.max(max, Math.max(max * arr[i], Math.max(arr[i], min * arr[i])));
				min = Math.min(min, Math.min(temp * arr[i], Math.min(arr[i], min * arr[i])));

				ovmax = Math.max(max, Math.max(ovmax, min));
			} else {
				max = 0;
				min = 0;

			}
		}
		System.out.println(ovmax);

	}

}
