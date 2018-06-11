package Recursion;

import java.util.Scanner;

public class CrossWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder[] crossword = new StringBuilder[10];
		for (int i = 0; i < 10; i++) {
			crossword[i] = new StringBuilder(sc.nextLine());
		}
		String[] words = (sc.nextLine()).split(";");
		int checkpos[][] = new int[10][10];

		printCrossWord(crossword, words, 0, checkpos);

	}

	public static void printCrossWord(StringBuilder[] matrix, String[] words, int wpsf, int[][] checkpos) {
		if (wpsf == words.length) {
			for (int i = 0; i < matrix.length; i++) {
				System.out.println(matrix[i]);
			}

			return;

		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if ((matrix[i].charAt(j) == '-' || matrix[i].charAt(j) == words[wpsf].charAt(0))
						&& isTheSpotValidHoriz(matrix, i, j, words[wpsf]) == true) {

					placeHoriz(matrix, words[wpsf], i, j, checkpos);

					printCrossWord(matrix, words, wpsf + 1, checkpos);

					UnplaceHoriz(matrix, words[wpsf], i, j, checkpos);

				}
				// vertically
				if ((matrix[i].charAt(j) == '-' || matrix[i].charAt(j) == words[wpsf].charAt(0))
						&& isTheSpotValidVert(matrix, i, j, words[wpsf])) {

					placeVert(matrix, words[wpsf], i, j, checkpos);

					printCrossWord(matrix, words, wpsf + 1, checkpos);

					UnplaceVert(matrix, words[wpsf], i, j, checkpos);

				}
			}
		}

	}

	public static boolean isTheSpotValidHoriz(StringBuilder[] matrix, int r, int c, String word) {

		if (c + word.length() - 1 >= 10) {
			return false;
		} else {
			for (int i = 0; i < word.length(); i++) {
				if (matrix[r].charAt(i + c) == '-' || matrix[r].charAt(i + c) == word.charAt(i)) {
					continue;

				} else {
					return false;
				}
			}

		}
		return true;

	}

	public static boolean isTheSpotValidVert(StringBuilder[] matrix, int r, int c, String word) {
		if (r + word.length() - 1 >= 10) {
			return false;
		} else {
			for (int i = 0; i < word.length(); i++) {
				if (matrix[r + i].charAt(c) == '-' || matrix[r + i].charAt(c) == word.charAt(i)) {
					continue;

				} else {
					return false;
				}
			}

		}
		return true;

	}

	public static void placeHoriz(StringBuilder[] matrix, String word, int r, int c, int[][] checkpos) {

		for (int i = 0; i < word.length(); i++) {
			checkpos[r][c + i]++;
			matrix[r].setCharAt(i + c, word.charAt(i));

		}

	}

	public static void placeVert(StringBuilder[] matrix, String word, int r, int c, int[][] checkpos) {

		for (int i = 0; i < word.length(); i++) {
			checkpos[r + i][c]++;
			matrix[r + i].setCharAt(c, word.charAt(i));

		}

	}

	public static void UnplaceHoriz(StringBuilder[] matrix, String word, int r, int c, int[][] checkpos) {

		for (int i = 0; i < word.length(); i++) {
			if (checkpos[r][c + i] == 1)
				matrix[r].setCharAt(i + c, '-');

			checkpos[r][c + i]--;

		}

	}

	public static void UnplaceVert(StringBuilder[] matrix, String word, int r, int c, int[][] checkpos) {

		for (int i = 0; i < word.length(); i++) {
			if (checkpos[r + i][c] == 1)

				matrix[r + i].setCharAt(c, '-');
			checkpos[r + i][c]--;

		}

	}
}