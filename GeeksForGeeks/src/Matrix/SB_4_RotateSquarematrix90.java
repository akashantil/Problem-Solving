package Matrix;

public class SB_4_RotateSquarematrix90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int n = matrix.length;
		 for (int i = 0; i < n / 2; i++) {
		 for (int j = i; j < n - i - 1; j++) {
		 int temp = matrix[i][j];
		 matrix[i][j] = matrix[j][n - i - 1];
		 matrix[j][n - i - 1] = matrix[n - i - 1][n - j - 1];
		 matrix[n - i - 1][n - j - 1] = matrix[n - j - 1][i];
		 matrix[n - j - 1][i] = temp;
		
		 }
		 }
//		rotateMatrix(n, matrix);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void rotateMatrix(int N, int mat[][]) {
		// Consider all squares one by one
		for (int x = 0; x < N / 2; x++) {
			// Consider elements in group of 4 in
			// current square
			for (int y = x; y < N - x - 1; y++) {
				// store current cell in temp variable
				int temp = mat[x][y];

				// move values from right to top
				mat[x][y] = mat[y][N - 1 - x];

				// move values from bottom to right
				mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];

				// move values from left to bottom
				mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];

				// assign temp to left
				mat[N - 1 - y][x] = temp;
			}
		}
	}

}
