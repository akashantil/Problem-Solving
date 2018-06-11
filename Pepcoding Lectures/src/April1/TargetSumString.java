package April1;

import java.util.ArrayList;

public class TargetSumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		// printTargetSumSet(arr, 0, 60, "", 0);
		printTargetSumSet(arr, 0, 60, new ArrayList<>(), 0);

	}

	public static void printTargetSumSet(int[] arr, int idx, int tar, String set, int sumSet) {
		if (idx >= arr.length) {
			if (sumSet == tar) {
				System.out.println(set);
				return;
			}
			return;
		}

		printTargetSumSet(arr, idx + 1, tar, set + arr[idx] + " ", sumSet + arr[idx]);
		printTargetSumSet(arr, idx + 1, tar, set, sumSet);
	}

	public static void printTargetSumSet(int[] arr, int idx, int tar, ArrayList<Integer> set, int sumSet) {
		if (idx >= arr.length) {
			if (sumSet == tar) {
				System.out.println(set);
				return;
			}
			return;
		}

		set.add(arr[idx]);
		printTargetSumSet(arr, idx + 1, tar, set, sumSet + arr[idx]);
		set.remove(set.size() - 1);
		printTargetSumSet(arr, idx + 1, tar, set, sumSet);
	}

}
