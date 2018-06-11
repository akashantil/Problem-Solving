package march24;

public class mazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = new int[5][4];
		pathsWithDiagWithMul(maze, 0, 0, 3, 2, "");

	}

	public static void paths(int[][] maze, int row, int col, int dr, int dc, String psf) {
		if (row == dr && col == dc) {
			System.out.println(psf);
			return;
		}
		if (col + 1 < maze[0].length) {
			paths(maze, row, col + 1, dr, dc, "H" + psf);
		}
		if (row + 1 < maze.length)
			paths(maze, row + 1, col, dr, dc, "V" + psf);

	}

	public static void pathsWithDiag(int[][] maze, int row, int col, int dr, int dc, String psf) {
		if (row == dr && col == dc) {
			System.out.println(psf);
			return;
		}
		if (col + 1 < maze[0].length) {
			pathsWithDiag(maze, row, col + 1, dr, dc, "H" + psf);
		}
		if (row + 1 < maze.length)
			pathsWithDiag(maze, row + 1, col, dr, dc, "V" + psf);

		if (row + 1 < maze.length && col + 1 < maze[0].length) {
			pathsWithDiag(maze, row + 1, col + 1, dr, dc, "D" + psf);
		}

	}

	static int c = 0;

	public static void pathsWithDiagWithMul(int[][] maze, int row, int col, int dr, int dc, String psf) {
		if (row == dr && col == dc) {
			c++;
			System.out.println(c + ". " + psf);
			return;
		}
		for (int i = 1; i < maze[0].length; i++) {
			if (col + i < maze[0].length) {
				pathsWithDiagWithMul(maze, row, col + i, dr, dc, "H" + i + psf);
			}
		}
		for (int i = 1; i < maze.length; i++) {
			if (row + i < maze.length)
				pathsWithDiagWithMul(maze, row + i, col, dr, dc, "V" + i + psf);
		}
		for (int i = 1; i < (int) (Math.min(maze[0].length, maze.length)); i++) {
			if (row + i < maze.length && col + i < maze[0].length) {
				pathsWithDiagWithMul(maze, row + i, col + i, dr, dc, "D" + i + psf);
			}
		}
	}

}
