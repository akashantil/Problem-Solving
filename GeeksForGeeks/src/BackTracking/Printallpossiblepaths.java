package BackTracking;

import java.util.ArrayList;

public class Printallpossiblepaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 },{10,11,12} };
		 ArrayList<String> ab = allPaths(s, 0, 0, s.length, s[0].length);
		 System.out.println(ab);
		
//		allPathsQA(s, 0, 0, s.length, s[0].length, "");

	}

	public static ArrayList<String> allPaths(int[][] array, int row, int col, int m, int n) {
		if (row == m - 1 && col == n - 1) {
			ArrayList<String> ab = new ArrayList<String>();
			ab.add("" + array[row][col]);
			return ab;

		}
		ArrayList<String> myres = new ArrayList<String>();

		if (col + 1 < n) {
			ArrayList<String> right = allPaths(array, row, col + 1, m, n);
			for (String ab : right) {
				myres.add(array[row][col] + " " + ab);
			}

		}
		if (row + 1 < m) {
			ArrayList<String> down = allPaths(array, row + 1, col, m, n);
			for (String ab : down) {
				myres.add(array[row][col] + " " + ab);
			}
		}

		return myres;

	}

	public static void allPathsQA(int[][] array, int row, int col, int m, int n, String ans) {
		if (row == m - 1 && col == n - 1) {
			ans = ans + array[row][col];
			System.out.println(ans);
			return;
		}

		if (col + 1 < n) {
			allPathsQA(array, row, col + 1, m, n, ans + array[row][col] + "");
		}
		if (row + 1 < m) {
			allPathsQA(array, row + 1, col, m, n, ans + array[row][col] + "");
		}

	}

}
