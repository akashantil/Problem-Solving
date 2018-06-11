package BackTracking;

public class LongestPossibleRoute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				         { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
				         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
		int[][] tc = new int[maze.length][maze[0].length];

		int count = longestpath(maze, 0, 0, tc, 1, 7);
		System.out.println(count);
	}

	public static int longestpath(int[][] maze, int row, int col, int[][] tc, int desr, int desc) {

		if (row == desr && col == desc) {
			return 0;

		}
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		
		if (col + 1 < maze[0].length && tc[row][col + 1] == 0 && maze[row][col + 1] != 0) {
			tc[row][col + 1] = 1;
			a1 = 1 + longestpath(maze, row, col + 1, tc, desr, desc);
			tc[row][col + 1] = 0;
		}

		
		if (row + 1 < maze.length && tc[row + 1][col] == 0 && maze[row + 1][col] != 0) {
			tc[row + 1][col] = 1;
			a2 = 1 + longestpath(maze, row + 1, col, tc, desr, desc);
			tc[row + 1][col] = 0;
		}

		
		if (col - 1 >= 0 && tc[row][col - 1] == 0 && maze[row][col - 1] != 0) {
			tc[row][col - 1] = 1;
			a3 = 1 + longestpath(maze, row, col - 1, tc, desr, desc);
			tc[row][col - 1] = 0;
		}

		
		if (row - 1 >= 0 && tc[row - 1][col] == 0 && maze[row - 1][col] != 0) {
			tc[row - 1][col] = 1;
			a4 = 1 + longestpath(maze, row - 1, col, tc, desr, desc);
			tc[row - 1][col] = 0;
		}
		return Math.max(a1, Math.max(a2, Math.max(a3, a4)));

	}

}
