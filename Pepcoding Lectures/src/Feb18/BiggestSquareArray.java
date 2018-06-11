package Feb18;

public class BiggestSquareArray {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 0, 0, 1 }, { 1, 1, 1, 0 }, { 1, 1, 1, 0 }, { 1, 1, 1, 0 }

		};

		Feb16.ArrayDisplay2d.Display(matrix);
		System.out.println();

		int rmax = matrix.length - 2;
		int cmax = matrix[0].length - 2;
		int rmin = 0, cmin = 0;

		int[][] arr = new int[matrix.length][matrix[0].length];

		for (int row = 0; row < matrix.length - 1; row++) {
			arr[row][matrix[0].length - 1] = matrix[row][matrix[0].length - 1];

		}

		for (int col = 0; col < matrix[0].length - 1; col++) {
			arr[matrix.length - 1][col] = matrix[matrix.length - 1][col];

		}

		Feb16.ArrayDisplay2d.Display(arr);
		System.out.println();

		for (int row = rmax; row >= rmin; row--) {
			for (int col = cmax; col >= cmin; col--) {
				if (matrix[row][col] == 0) {
					arr[row][col] = 0;

				} else if (matrix[row][col] == 1) {
					arr[row][col] = (Feb18.MinOfThree.MinofThree(arr[row + 1][col], arr[row][col + 1],
							arr[row + 1][col + 1]) + 1);
				}

			}
		}
		Feb16.ArrayDisplay2d.Display(arr);
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] > max)
					max = arr[i][j];

			}
		}
		System.out.println();
		System.out.println("MAx subArray size possible --->>" + max);

	}

	// TODO Auto-generated method stub

}
