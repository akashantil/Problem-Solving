package Recursion;

import java.util.Scanner;

public class CrossWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] a = new String[10];
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextLine();

		}
		char arr[][] = new char[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				char x = a[i].charAt(j);
				arr[i][j] = x;

			}
		}

		String words = sc.nextLine();

		String[] warr = words.split(";");

		solve(arr, warr, 0, false);

	}

	private static void solve(char[][] arr, String[] warr, int idx, boolean res) {

		if (res == true)
			return;

		if (idx == warr.length) {
			if (printIfValid(arr) == true) {
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[0].length; j++) {
						System.out.print(arr[i][j]);
					}
					System.out.println();
				}

			}
			return;

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == '-' || arr[i][j] == warr[idx].charAt(0)) {

					// check valid vertical

					if (checkVertically(arr, warr[idx], 0, i, j) == true) {
						boolean[] visitedvert = SetVertically(arr, warr[idx], 0, i, j);

						solve(arr, warr, idx + 1, res);
						ResetVertically(arr, i, j, visitedvert, 0);
					}

					if (checkHorizontally(arr, warr[idx], 0, i, j) == true) {
						boolean[] visitedhoriz = SetHorizontally(arr, warr[idx], 0, i, j);

						solve(arr, warr, idx + 1, res);

						ResetHorizontally(arr, i, j, visitedhoriz, 0);

					}

				}

			}
		}
	}

	private static boolean printIfValid(char[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == '-')
					return false;
			}

		}
		return true;

	}

	public static boolean checkVertically(char[][] arr, String word, int idx, int row, int col) {

		for (int i = row; idx < word.length(); i++) {
			if (i == arr.length)
				return false;
			if (arr[i][col] != '-' && arr[i][col] != word.charAt(idx))
				return false;

			idx++;
		}
		return true;

	}

	public static boolean checkHorizontally(char[][] arr, String word, int idx, int row, int col) {

		for (int i = col; idx < word.length(); i++) {
			if (i == arr[0].length)
				return false;
			if (arr[row][i] != '-' && arr[row][i] != word.charAt(idx))
				return false;

			idx++;
		}
		return true;

	}

	public static boolean[] SetVertically(char[][] arr, String word, int idx, int row, int col) {

		boolean[] markVert = new boolean[word.length()];

		for (int i = row; i < arr.length && idx < word.length(); i++) {
			if (arr[i][col] == '-') {
				arr[i][col] = word.charAt(idx);
				markVert[idx] = true;

			}

			idx++;
		}
		return markVert;

	}

	public static boolean[] SetHorizontally(char[][] arr, String word, int idx, int row, int col) {

		boolean[] markHoriz = new boolean[word.length()];

		for (int i = col; i < arr[0].length && idx < word.length(); i++) {
			if (arr[row][i] == '-') {
				arr[row][i] = word.charAt(idx);
				markHoriz[idx] = true;

			}

			idx++;
		}
		return markHoriz;

	}

	public static void ResetVertically(char[][] arr, int row, int col, boolean[] markVert, int idx) {

		for (int i = row; i < arr.length && idx < markVert.length; i++) {
			if (markVert[idx] == true) {
				arr[i][col] = '-';

			}

			idx++;
		}

	}

	public static void ResetHorizontally(char[][] arr, int row, int col, boolean[] markHoriz, int idx) {

		for (int i = col; i < arr[0].length && idx < markHoriz.length; i++) {
			if (markHoriz[idx] == true) {
				arr[row][i] = '-';

			}

			idx++;
		}

	}
}
