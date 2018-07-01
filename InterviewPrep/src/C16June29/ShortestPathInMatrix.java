package C16June29;

import java.util.Scanner;

public class ShortestPathInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = sc.nextInt();

		int[][] visited = new int[row][col];
		int sr = sc.nextInt();
		int sco = sc.nextInt();
		int dr = sc.nextInt();
		int dc = sc.nextInt();

		System.out.println(solve(arr, visited, sr, sco, dr, dc) );

	}

	public static int solve(int[][] arr, int[][] visited, int sr, int sco, int dr, int dc) {
		if (sr == dr && sco == dc)
			return 0;

		if (!isvalid(arr, visited, sr, sco))
			return Integer.MAX_VALUE - 1000;
		else {
			visited[sr][sco] = 1;

			int right = 1 + solve(arr, visited, sr, sco + 1, dr, dc);
			int left = 1 + solve(arr, visited, sr, sco - 1, dr, dc);
			int up = 1 + solve(arr, visited, sr - 1, sco, dr, dc);
			int down= 1+solve(arr, visited, sr + 1, sco, dr, dc);

			visited[sr][sco] = 0;

			return Math.min(left, Math.min(right, Math.min(up, down)));
		}

	}

	private static boolean isvalid(int[][] arr, int[][] visited, int sr, int sco) {

		if (sr < 0 || sr >= arr.length)
			return false;
		if (sco < 0 || sco >= arr[0].length)
			return false;
		if (visited[sr][sco] == 1)
			return false;
		if (arr[sr][sco] == 0)
			return false;

		return true;
		// TODO Auto-generated method stub

	}

}
