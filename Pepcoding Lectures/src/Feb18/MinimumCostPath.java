package Feb18;

public class MinimumCostPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 10, 5, 4 }, { 6, 2, 10 }, { 9, 8, 7 }, };
		MinCostPath(arr);
	}

	public static void MinCostPath(int[][] matrix) {
		int[][] arr = new int[matrix.length][matrix[0].length];

		int rmax = matrix.length - 1;
		int cmax = matrix[0].length - 1;
		// int rmin = 0, cmin = 0;

		arr[rmax][cmax] = matrix[rmax][cmax];

		for (int row = rmax - 1; row >= 0; row--) {
			arr[row][cmax] = matrix[row][cmax] + arr[row + 1][cmax];

		}

		for (int col = cmax - 1; col >= 0; col--) {
			arr[rmax][col] = matrix[rmax][col] + arr[rmax][col + 1];

		}
		// Feb16.ArrayDisplay2d.Display(arr);
		// System.out.println();
		//

		for (int i = rmax - 1; i >= 0; i--) {
			for (int j = cmax - 1; j >= 0; j--) {
				arr[i][j] = (Math.min(arr[i][j + 1], arr[i + 1][j]) + matrix[i][j]);

			}
		}

		System.out.println("Minimum cost to travel is " + arr[0][0]);

		Feb16.ArrayDisplay2d.Display(arr);

	}

}
