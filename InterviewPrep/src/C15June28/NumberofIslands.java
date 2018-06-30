package C15June28;

import java.util.Scanner;

public class NumberofIslands {
	// public class Heapmover{
	// int count=0;
	//
	// }

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = sc.nextInt();

		boolean[][] visited = new boolean[arr.length][arr[0].length];

		// Heapmover co= new Heapmover();
		System.out.println(solve(arr, visited));

	}

	public static int solve(int[][] arr, boolean[][] visited) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 1 && visited[i][j] == false) {

					markallSpots(arr, visited, i, j);
					count++;

				}
			}
		}
		return count;
	}

	private static void markallSpots(int[][] arr, boolean[][] visited, int i, int j) {
		// TODO Auto-generated method stub
		if (isvalid(arr, visited, i, j)) {
			visited[i][j] = true;

			markallSpots(arr, visited, i + 1, j);
			markallSpots(arr, visited, i, j + 1);
			markallSpots(arr, visited, i - 1, j);
			markallSpots(arr, visited, i, j - 1);

		}

	}

	private static boolean isvalid(int[][] arr, boolean[][] visited, int i, int j) {
		// TODO Auto-generated method stub

		if (i < 0 || i >= arr.length)
			return false;
		if (j < 0 || j >= arr[0].length)
			return false;
		if (visited[i][j] == true || arr[i][j] == 0)
			return false;
		return true;
	}

}
