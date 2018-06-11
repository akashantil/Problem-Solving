package assingmentRecursion2;

import java.util.Scanner;

public class Pep_Java_7Recursion_43SplittingInTwoGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];

		}
		System.out.println(sum);
		int co = noOfways(arr, sum / 2, 0, 0, 0, "");
		System.out.println(co);
		System.out.println(match);
	}

	static int match = 0;

	public static int noOfways(int[] arr, int target, int sum, int idx, int count, String ans) {

		if (idx == arr.length) {
			if (sum == target) {
				count += 1;
				System.out.println(ans);
				match++;
				return count;

			}
			return 0;
		}

		int inc = noOfways(arr, target, sum + arr[idx], idx + 1, count, ans + " " + arr[idx]);
		int exc = noOfways(arr, target, sum, idx + 1, count, ans);

		return inc + exc;

		// return count;

	}

}
