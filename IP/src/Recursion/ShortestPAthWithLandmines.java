package Recursion;

import java.util.Scanner;

public class ShortestPAthWithLandmines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] arr = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++)
				arr[i][j] = sc.nextInt();
		}

		markAdjacent(arr, x, y);

		for (int i = 0; i < x; i++) {
			int csf = solve(arr, x, y, new int[x][y], i, 0);

			if (min > csf)
				min = csf;

		}
		System.out.println(min);
	}

	static int min = Integer.MAX_VALUE;

	public static void markAdjacent(int[][] arr, int x, int y) {

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (arr[i][j] == 0) {
					// left

					if (j - 1 >= 0 && arr[i][j - 1] != 0)
						arr[i][j - 1] = -1;

					// right
					if (j + 1 < y && arr[i][j + 1] != 0)
						arr[i][j + 1] = -1;

					// up
					if (i - 1 >= 0 && arr[i - 1][j] != 0)
						arr[i - 1][j] = -1;

					// down
					if (i + 1 < x && arr[i + 1][j] != 0)
						arr[i + 1][j] = -1;
				}
			}

		}

	}

	public static int solve(int[][] arr, int x, int y, int[][] visited, int i, int j) {

		if (j == y - 1) {

			return 0;
		}

		if (valid(arr, x, y, visited, i, j) == false)
			return 1000;

		visited[i][j] = 1;
		int left = 1 + solve(arr, x, y, visited, i, j - 1);
		int right = 1 + solve(arr, x, y, visited, i, j + 1);
		int up = 1 + solve(arr, x, y, visited, i - 1, j);
		int down = 1 + solve(arr, x, y, visited, i + 1, j);
		visited[i][j] = 0;

		return Math.min(left, Math.min(right, Math.min(up, down)));

	}

	public static boolean valid(int[][] arr, int x, int y, int[][] visited, int i, int j) {

		if (i >= x || j >= y || i < 0 || j < 0 || arr[i][j] == -1 || visited[i][j] == 1)
			return false;

		return true;
	}
}
