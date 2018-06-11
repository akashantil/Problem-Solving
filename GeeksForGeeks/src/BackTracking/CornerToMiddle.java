package BackTracking;

public class CornerToMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 3, 5, 4, 4, 7, 3, 4, 6, 3 }, { 6, 7, 5, 6, 6, 2, 6, 6, 2 }, { 3, 3, 4, 3, 2, 5, 4, 7, 2 },
				{ 6, 5, 5, 1, 2, 3, 6, 5, 6 }, { 3, 3, 4, 3, 0, 1, 4, 3, 4 }, { 3, 5, 4, 3, 2, 2, 3, 3, 5 },
				{ 3, 5, 4, 3, 2, 6, 4, 4, 3 }, { 3, 5, 1, 3, 7, 5, 3, 6, 4 }, { 6, 2, 4, 3, 4, 5, 4, 5, 1 } };

		int[][] tc = new int[maze.length][maze[0].length];

		path(maze, 0, 0, "", tc);

	}

	public static void path(int[][] maze, int row, int col, String path, int[][] tc) {
		if (row == maze.length / 2 && col == maze.length / 2) {
			path += row + "" + col + " Reached Mid ";
			System.out.println(path);

		}

		if ((row >= 0 && row < maze.length && col + maze[row][col] >= 0 && col + maze[row][col] < maze[0].length)
				&& tc[row][col + maze[row][col]] == 0) {
			tc[row][col + maze[row][col]] = 1;
			path(maze, row, col + maze[row][col], path + "(" + row + "," + col + ")--->", tc);
		}

		if ((row + maze[row][col] >= 0 && row + maze[row][col] < maze.length) && (col >= 0 && col <= maze.length)
				&& tc[row + maze[row][col]][col] == 0) {
			tc[row + maze[row][col]][col] = 1;
			path(maze, row + maze[row][col], col, path + "(" + row + "," + col + ")--->", tc);
		}

		if ((row >= 0 && row < maze.length && col - maze[row][col] >= 0 && col - maze[row][col] < maze[0].length)
				&& tc[row][col - maze[row][col]] == 0) {
			tc[row][col - maze[row][col]] = 1;
			path(maze, row, col - maze[row][col], path + "(" + row + "," + col + ")--->", tc);
		}

		if ((row - maze[row][col] >= 0 && row - maze[row][col] < maze.length) && (col >= 0 && col <= maze.length)
				&& tc[row - maze[row][col]][col] == 0) {
			tc[row - maze[row][col]][col] = 1;
			path(maze, row - maze[row][col], col, path + "(" + row + "," + col + ")--->", tc);
		}

	}

}
