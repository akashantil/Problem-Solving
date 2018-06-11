package BackTracking;

import java.util.ArrayList;

public class LandMinesWithBAckTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }

		};
		int[][] tc = new int[maze.length][maze[0].length];
		markInvalidPoints(maze);
		String result = null;
		for (int i = 0; i < maze.length; i++) {

			String challenger = path(maze, tc, i, 0, "");
			result = handleChallenge(result, challenger);

		}

		System.out.println(result + " " + result.length());
	}

	public static void markInvalidPoints(int[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[i][j] == 0) {
					if (i - 1 >= 0 && maze[i - 1][j] != 0)
						maze[i - 1][j] = 2;
					if (i + 1 < maze.length && maze[i + 1][j] != 0)
						maze[i + 1][j] = 2;
					if (j - 1 >= 0 && maze[i][j - 1] != 0)
						maze[i][j - 1] = 2;
					if (j + 1 < maze[0].length && maze[i][j + 1] != 0)
						maze[i][j + 1] = 2;
				}
			}
		}
	}

	public static String path(int[][] maze, int[][] tc, int row, int col, String psf) {
		if (col == maze[0].length - 1) {
			return psf;
		}

		if (isValid(row, col, maze, tc) == true)
			return null;

		String myresult = null;

		tc[row][col] = 1;

		String rresult = path(maze, tc, row, col + 1, psf + "R");
		myresult = handleChallenge(myresult, rresult);

		String dresult = path(maze, tc, row + 1, col, psf + "D");
		myresult = handleChallenge(myresult, dresult);

		String lresult = path(maze, tc, row, col - 1, psf + "L");
		myresult = handleChallenge(myresult, lresult);

		String uresult = path(maze, tc, row - 1, col, psf + "U");
		myresult = handleChallenge(myresult, uresult);

		tc[row][col] = 0;

		return myresult;
	}

	private static String handleChallenge(String myresult, String challenger) {
		if (myresult == null) {
			return challenger;
		} else if (challenger == null) {
			return myresult;
		} else {
			return challenger.length() < myresult.length() ? challenger : myresult;
		}
	}

	public static boolean isValid(int row, int col, int[][] maze, int[][] tc) {

		if (row < 0 || row >= maze.length)
			return true;
		else if (col < 0 || col >= maze[0].length)
			return true;
		else if (maze[row][col] == 2 || tc[row][col] == 1 || maze[row][col] == 0)
			return true;
		else
			return false;
	}

}
