package REvision;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		solve(grid, 0, 0);

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean solve(int[][] matrix, int row, int col) {

		if (valid(matrix))
			return true;

		boolean ans = false;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (matrix[i][j] == 0) {

					for (int no = 1; no < 10; no++) {
						if (iscolSafe(matrix, col, no) && isRowSafe(matrix, row, no)
								&& isGridSafe(matrix, row, col, no)) {
							matrix[row][col] = no;

							if (valid(matrix))
								return true;

							ans = solve(matrix, row, col);
							if (ans)
								return true;

							matrix[row][col] = 0;

						}
					}
				}

			}
		}
		return ans;

	}

	public static boolean isRowSafe(int[][] matrix, int row, int no) {

		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[row][i] == no)
				return false;

		}
		return true;

	}

	public static boolean iscolSafe(int[][] matrix, int col, int no) {

		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[i][col] == no)
				return false;

		}
		return true;

	}

	public static boolean isGridSafe(int[][] matrix, int row, int col, int no) {

		int gsr = row / 3 * 3;
		int gsc = col / 3 * 3;

		for (int i = gsr; i < gsr + 3; i++) {
			for (int j = gsc; j < gsc + 3; j++) {
				if (matrix[i][j] == no)
					return false;
			}
		}

		return true;

	}

	public static boolean valid(int[][] matrix) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (matrix[i][j] == 0)
					return false;
			}
		}
		return true;
	}

}
