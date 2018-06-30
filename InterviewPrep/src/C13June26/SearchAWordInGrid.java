package C13June26;

import java.util.Scanner;

public class SearchAWordInGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int r = scn.nextInt();// This represents number of strings
		int c = scn.nextInt();// this represents length of each string

		char[][] arr = new char[r][c];
		String[] str = new String[r];
		for (int i = 0; i < r; i++) {
			str[i] = scn.next();
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = str[i].charAt(j);
			}
		}
		String word = scn.next();
		if (search(arr, word)) {
			System.out.println("Yes");

		} else
			System.out.println("No");

	}

	public static boolean search(char[][] arr, String word) {

		int[] x = { 1, 1, 1, 0, 0, -1, -1, -1 };
		int[] y = { 0, 1, -1, 1, -1, 0, 1, -1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int idx = 0;

				char gc = arr[i][j];
				char dc = word.charAt(idx);

				if (gc == dc) {

					idx++;

					for (int k = 0; k < x.length; k++) {

						int row = i + x[k];
						int col = j + y[k];

						if (bound(arr, row, col)) {

							if (arr[row][col] == word.charAt(idx)) {

								if (searchinDir(arr, word, idx, row, col, x[k], y[k]))
									return true;

							}

						}

					}

				}

			}
		}
		return false;

	}

	public static boolean bound(char[][] arr, int row, int col) {
		if (row < 0 || row >= arr.length)
			return false;
		if (col < 0 || col >= arr[0].length)
			return false;

		return true;
	}

	public static boolean searchinDir(char[][] arr, String word, int idx, int row, int col, int i, int j) {

		while (idx < word.length() && bound(arr, row, col) && word.charAt(idx) == arr[row][col]) {

			idx++;
			row += i;
			col += j;

		}
		if (idx == word.length())
			return true;

		return false;

	}

}
