package REvision;

import java.util.ArrayList;

public class PartitionSetIntoKSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 1, 5, 5, 6 };
		int k = 3;

		ArrayList<Integer>[] subsets = new ArrayList[k];
		for (int i = 0; i < k; i++) {
			subsets[i] = new ArrayList<>();
		}
		int[] subsum = new int[k];

		boolean res = solve(subsets, subsum, arr, 0, k);
		if (res) {
			for (int i = 0; i < k; i++) {
				System.out.print(subsets[i] + "   ");
			}
			System.out.println(res);
		} else
			System.out.println(res);
	}

	public static boolean solve(ArrayList<Integer>[] subset, int[] subsum, int[] arr, int vidx, int k) {

		if (vidx == arr.length) {

			for (int i = 1; i < subsum.length; i++) {
				if (subsum[i] != subsum[i - 1])
					return false;
			}
			return true;

		}

		boolean res = false;

		for (int i = 0; i < k; i++) {

			subset[i].add(arr[vidx]);
			subsum[i] += arr[vidx];

			res = solve(subset, subsum, arr, vidx + 1, k);

			if (res)
				return res;

			subset[i].remove(subset[i].size() - 1);
			subsum[i] -= arr[vidx];

		}
		return res;

	}

}
