package Recursion;

import java.util.Scanner;

public class LongestPAhWithHurdle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int[][] arr = new int[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++)
				arr[i][j] = sc.nextInt();
		}

		int csf = solve(arr, x, x, new int[x][x], 0, 0);
		System.out.println(csf);

	}

	public static int solve(int[][] arr, int x, int y, int[][] visited, int i, int j) {

		if (j == y - 1 && i == x - 1) {

			return 0;
		}

		if (valid(arr, x, y, visited, i, j) == false)
			return -100;

		visited[i][j] = 1;
		int left = 1 + solve(arr, x, y, visited, i, j - 1);
		int right = 1 + solve(arr, x, y, visited, i, j + 1);
		int up = 1 + solve(arr, x, y, visited, i - 1, j);
		int down = 1 + solve(arr, x, y, visited, i + 1, j);
		visited[i][j] = 0;

		return Math.max(left, Math.max(right, Math.max(up, down)));

	}

	public static boolean valid(int[][] arr, int x, int y, int[][] visited, int i, int j) {

		if (i >= x || j >= y || i < 0 || j < 0 || arr[i][j] == 0 || visited[i][j] == 1)
			return false;

		return true;
	}
}
