package BackTracking;

import java.util.ArrayList;

public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 7, 5, 18, 12, 20, 15 };
		int targetsum = 35;

		ArrayList<String> ab = subset2(array, 0, 35, 0);
		System.out.println(ab);

	}

	public static ArrayList<String> subset(int[] array, int idx, int target, int sum, String ans) {
		if (sum == target) {
			ArrayList<String> ab = new ArrayList<String>();
			ab.add(ans);
			return ab;
		}

		if (idx == array.length) {

			ArrayList<String> ab = new ArrayList<String>();

			return ab;

		}

		ArrayList<String> inc = subset(array, idx + 1, target, sum + array[idx], ans + array[idx] + " ");

		ArrayList<String> exc = subset(array, idx + 1, target, sum, ans);

		ArrayList<String> myres = new ArrayList<String>();

		for (String ab : inc) {
			myres.add(ab);

		}
		for (String ab : exc) {
			myres.add(ab);

		}
		return myres;

	}

	public static ArrayList<String> subset2(int[] array, int idx, int target, int sum) {
		if (sum == target) {
			ArrayList<String> ab = new ArrayList<String>();
			ab.add("");
			return ab;
		}

		if (idx == array.length) {

			ArrayList<String> ab = new ArrayList<String>();

			return ab;

		}

		ArrayList<String> inc = subset2(array, idx + 1, target, sum + array[idx]);

		ArrayList<String> exc = subset2(array, idx + 1, target, sum);

		ArrayList<String> myres = new ArrayList<String>();

		for (String ab : inc) {
			myres.add(array[idx] + " " + ab);

		}
		for (String ab : exc) {
			myres.add(ab);

		}
		return myres;

	}

}
