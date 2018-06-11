package Matrix;

public class SB_6_ReplaceOWithX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] matrix = { { 'X', 'O', 'X', 'X', 'X', 'X' }, { 'X', 'O', 'X', 'X', 'O', 'X' },
				{ 'X', 'X', 'X', 'O', 'O', 'X' }, { 'O', 'X', 'X', 'X', 'X', 'X' }, { 'X', 'X', 'X', 'O', 'X', 'O' },
				{ 'O', 'O', 'X', 'O', 'O', 'O' }, };

		smart(matrix);

	}

	// O(n^3)
	public static void fakesmart(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 'O') {

					// look up

					boolean up = lookup(matrix, i, j);
					// look down
					boolean down = lookdown(matrix, i, j);
					// look right
					boolean right = lookright(matrix, i, j);
					// look left
					boolean left = lookleft(matrix, i, j);

					if (up == true && down == true && right == true && left == true) {
						matrix[i][j] = 'X';
					} else
						continue;

				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}

	}

	public static boolean lookup(char[][] matrix, int r, int c) {

		for (int i = r; i >= 0; i--) {
			if (matrix[i][c] == 'X')
				return true;
		}
		return false;

	}

	public static boolean lookdown(char[][] matrix, int r, int c) {

		for (int i = r; i < matrix.length; i++) {
			if (matrix[i][c] == 'X')
				return true;
		}
		return false;

	}

	public static boolean lookright(char[][] matrix, int r, int c) {

		for (int i = c; i < matrix[0].length; i++) {
			if (matrix[r][i] == 'X')
				return true;
		}
		return false;

	}

	public static boolean lookleft(char[][] matrix, int r, int c) {

		for (int i = c; i >= 0; i--) {
			if (matrix[r][i] == 'X')
				return true;
		}
		return false;

	}

	// O(n^2)
	public static void smart(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 'O')
					matrix[i][j] = '-';

			}
		}

		// left wall
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == '-') {
				down(matrix, i, 0, '-', 'O');
				up(matrix, i, 0, '-', 'O');
				right(matrix, i, 0, '-', 'O');
				left(matrix, i, 0, '-', 'O');
			}

		}
		// top wall
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == '-') {
				down(matrix, 0, i, '-', 'O');
				up(matrix, 0, i, '-', 'O');
				right(matrix, 0, i, '-', 'O');
				left(matrix, 0, i, '-', 'O');
			}

		}
		// bottom wall
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[matrix.length - 1][i] == '-') {
				down(matrix, matrix.length - 1, i, '-', 'O');
				up(matrix, matrix.length - 1, i, '-', 'O');
				right(matrix, matrix.length - 1, i, '-', 'O');
				left(matrix, matrix.length - 1, i, '-', 'O');
			}

		}
		// right wall

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][matrix[0].length - 1] == '-') {
				down(matrix, i, matrix[0].length - 1, '-', 'O');
				up(matrix, i, matrix[0].length - 1, '-', 'O');
				right(matrix, i, matrix[0].length - 1, '-', 'O');
				left(matrix, i, matrix[0].length - 1, '-', 'O');
			}

		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == '-')
					matrix[i][j] = 'X';

			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}

	}

	public static void down(char[][] matrix, int r, int c, char prev, char nchar) {
		if (r >= matrix.length ||r<0 ||c<0 ||c>=matrix[0].length)
			return;
		if (matrix[r][c] == 'X')
			return;
		else
			matrix[r][c] = nchar;
		down(matrix, r + 1, c, prev, nchar);
	}

	public static void up(char[][] matrix, int r, int c, char prev, char nchar) {
		if (r >= matrix.length ||r<0 ||c<0 ||c>=matrix[0].length)
			return;
		if (matrix[r][c] == 'X')
			return;
		else
			matrix[r][c] = nchar;
		down(matrix, r - 1, c, prev, nchar);
	}

	public static void left(char[][] matrix, int r, int c, char prev, char nchar) {
		if (r >= matrix.length ||r<0 ||c<0 ||c>=matrix[0].length)
			return;
		if (matrix[r][c] == 'X')
			return;
		else
			matrix[r][c] = nchar;
		down(matrix, r, c - 1, prev, nchar);
	}

	public static void right(char[][] matrix, int r, int c, char prev, char nchar) {
		if (r >= matrix.length ||r<0 ||c<0 ||c>=matrix[0].length)
			return;
		if (matrix[r][c] == 'X')
			return;
		else
			matrix[r][c] = nchar;
		down(matrix, r, c + 1, prev, nchar);
	}

}