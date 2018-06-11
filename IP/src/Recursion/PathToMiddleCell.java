package Recursion;

import java.util.Scanner;

public class PathToMiddleCell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int[][] arr = new int[x][y];
		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				arr[i][j] = sc.nextInt();

		for (int i = 0; i < arr.length; i++)
			solve(arr, i, 0, "", new int[x][y]);
	}

	public static void solve(int[][] arr, int x, int y, String psf, int[][] visited) {

		if (x == arr.length / 2 && y == arr[0].length / 2) {
			psf += "MID";
			System.out.println(psf);
			return;
		}

		if (valid(arr, x, y, visited)) {
			visited[x][y] = 1;
			solve(arr, x + arr[x][y], y, psf + x + "" + y + " ", visited);
			solve(arr, x, y + arr[x][y], psf + x + "" + y + " ", visited);
			solve(arr, x, y - arr[x][y], psf + x + "" + y + " ", visited);

			solve(arr, x - arr[x][y], y, psf + x + "" + y + " ", visited);

			visited[x][y] = 0;
		}

	}

	public static boolean valid(int[][] arr, int x, int y, int[][] visited) {
		if (x < 0 || x >= arr.length || y < 0 || y >= arr[0].length || visited[x][y] == 1)
			return false;

		return true;

	}

}
