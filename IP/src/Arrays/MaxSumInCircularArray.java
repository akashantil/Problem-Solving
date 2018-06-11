package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumInCircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		int arr[] = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		int max = arr[arr.length - 1] + 1;

		int k = 0;// minidx
		int j = arr.length - 1;// maxidx

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = ((arr[j] % max) * max) + arr[i];
				j--;

			} else {
				arr[i] = ((arr[k] % max) * max) + arr[i];
				k++;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] /= max;
		}
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			sum += Math.abs(arr[i] - arr[i + 1]);

		}
		sum += arr[0] - arr[arr.length - 1];
		System.out.println(sum);

	}

}
