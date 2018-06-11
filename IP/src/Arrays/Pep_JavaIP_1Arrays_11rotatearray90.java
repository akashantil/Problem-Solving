package Matrix;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_11rotatearray90 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int som = sc.nextInt();

		int[][] matrix = new int[som][som];

		for (int i = 0; i < som; i++) {
			for (int j = 0; j < som; j++) {
				matrix[i][j] = sc.nextInt();

			}
		}
		transpose(matrix);

		rotateclockwise(matrix);
		printmatrix(matrix);

		rotateclockwise(matrix);

		rotateanticlockwise(matrix);
		System.out.println();

		printmatrix(matrix);

	}

	public static void transpose(int[][] matrix) {
		

		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

	}

	public static void rotateclockwise(int[][] matrix) {

		int i = 0;
		int j = matrix.length - 1;

		int row = 0;
		while (i < j) {
			row = 0;
			while (row < matrix.length) {
				int temp = matrix[row][i];
				matrix[row][i] = matrix[row][j];
				matrix[row][j] = temp;
				row++;
			}
			i++;
			j--;

		}

	}

	public static void rotateanticlockwise(int[][] matrix) {

		int i = 0;
		int j = matrix.length - 1;

		int col = 0;
		while (i < j) {
			col = 0;
			while (col < matrix.length) {
				int temp = matrix[i][col];
				matrix[i][col] = matrix[j][col];
				matrix[j][col] = temp;
				col++;
			}
			i++;
			j--;

		}

	}

	public static void printmatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}
	}
}
