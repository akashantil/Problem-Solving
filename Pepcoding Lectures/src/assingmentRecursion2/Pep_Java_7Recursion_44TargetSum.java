package assingmentRecursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pep_Java_7Recursion_44TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		ArrayList<String> ab = targetSum(arr, target, 0, 0, "");
		System.out.println(ab.size());
		System.out.println(ab);
		Target(arr, 0, "", target, 0);

	}

	public static ArrayList<String> targetSum(int[] arr, int target, int sum, int idx, String ans) {
		if (idx == arr.length) {
			if (sum == target) {
				ArrayList<String> ab = new ArrayList<String>();
				ab.add(ans);
				return ab;
			}
			ArrayList<String> ab = new ArrayList<String>();

			return ab;
		}

		ArrayList<String> inc = targetSum(arr, target, sum + arr[idx], idx + 1, ans + arr[idx] + " ");
		ArrayList<String> exc = targetSum(arr, target, sum, idx + 1, ans);
		ArrayList<String> myres = new ArrayList<String>();

		for (String as : inc) {
			myres.add(as);

		}
		for (String as : exc) {
			myres.add(as);

		}
		return myres;
	}

	public static void Target(int[] arr, int idx, String ans, int target, int sum) {
		if (idx == arr.length) {
			if (sum == target) {
				System.out.println(ans);
				return;
			}
			return;

		}

		Target(arr, idx + 1, ans + arr[idx] + " ", target, sum + arr[idx]);
		Target(arr, idx + 1, ans, target, sum);
	}

}
