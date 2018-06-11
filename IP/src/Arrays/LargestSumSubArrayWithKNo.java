package Arrays;

import java.util.Scanner;

public class LargestSumSubArrayWithKNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int ws = sc.nextInt();

		int[] left = new int[arr.length];

		left[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			int cs = left[i - 1] + arr[i];
			left[i] = Math.max(cs, Math.max(left[i - 1], arr[i]));
		}

		int sum = 0;

		for (int i = 0; i < ws; i++) {
			sum += arr[i];

		}
		int result = sum;
		for (int i = ws; i < arr.length; i++) {

			sum += arr[i] - arr[i - ws];

			result = Math.max(sum, result);

			result = Math.max(result, sum + left[i - ws]);

		}
		System.out.println(result);

	}

}
