package May31;

import java.util.ArrayList;

public class RecursivelyPrintAllSentencesThatCAnBeFormed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr = { { "you", "we" }, { "have", "are" }, { "sleep", "eat", "drink" } };

//		solve(arr, 0, 0, "");
		
		System.out.println(solve(arr, 0, 0));

	}

	// brute-Force
	public static void solve(String[][] arr, int row, int col, String asf) {

		if (row == arr.length) {
			System.out.println(asf);
			return;
		}

		for (int i = 0; i < arr[row].length; i++) {

			solve(arr, row + 1, i, asf + arr[row][i] + " ");

		}

	}
	// Better Approach

	public static ArrayList<String> solve(String[][] arr, int row, int col) {

		if (row == arr.length) {
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;

		}

		ArrayList<String> recres = new ArrayList<>();
		ArrayList<String> ab = solve(arr, row + 1, col);

		for (int i = 0; i < arr[row].length; i++) {

			for (int j = 0; j < ab.size(); j++) {
				String a = ab.get(j);
				String ns = arr[row][i] + " " + a;
				recres.add(ns);
			}

		}

		return recres;

	}

}
