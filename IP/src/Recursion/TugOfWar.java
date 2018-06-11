package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class TugOfWar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// think about greedy approach
		// solution below is brute force solution

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		boolean ab = tow(arr, 0, 0, 0, new ArrayList<>(), new ArrayList<>());
	}

	public static boolean tow(int[] arr, int idx, int sum1, int sum2, ArrayList<String> set1, ArrayList<String> set2) {

		if (idx == arr.length) {
			if (arr.length % 2 == 0 && set1.size() == set2.size() && sum1 == sum2) {
				System.out.print(set1 + "" + set2);
				return true;
				
			} else if (arr.length % 2 == 1
					&& (set1.size() == (arr.length - 1) / 2 || set1.size() == (arr.length + 1) / 2)
					&& (Math.abs(sum1 - sum2) == 1 || Math.abs(sum1 - sum2) == 0)) {
				System.out.print(set1 + "" + set2);
				return true;

			}

			return false;
		}

		set1.add(arr[idx] + "");

		boolean res1 = tow(arr, idx + 1, sum1 + arr[idx], sum2, set1, set2);
		if (res1)
			return true;
		set1.remove(set1.size() - 1);

		set2.add(arr[idx] + "");

		boolean res2 = tow(arr, idx + 1, sum1, sum2 + arr[idx], set1, set2);
		if (res2)
			return true;

		set2.remove(set2.size() - 1);

		return false;

	}

}
