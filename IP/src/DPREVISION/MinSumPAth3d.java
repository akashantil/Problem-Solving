package DPREVISION;

public class MinSumPAth3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] arr = { { { 1, 2, 4 }, { 3, 4, 5 }, { 5, 2, 1 } }, { { 4, 8, 3 }, { 5, 2, 1 }, { 3, 4, 2 } },
				{ { 2, 4, 1 }, { 3, 1, 4 }, { 6, 3, 8 } } };

		int[][][] temp = new int[arr.length][arr[0].length][arr[0][0].length];

		temp[0][0][0] = arr[0][0][0];
		for (int i = 1; i < arr.length; i++)
			temp[i][0][0] = temp[i - 1][0][0] + arr[i][0][0];

		for (int i = 1; i < arr[0].length; i++)
			temp[0][i][0] = temp[0][i - 1][0] + arr[0][i][0];

		for (int i = 1; i < arr[0][0].length; i++)
			temp[0][0][i] = temp[0][0][i - 1] + arr[0][0][i];

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				temp[i][j][0] = Math.min(temp[i - 1][j][0], temp[i][j - 1][0]) + arr[i][j][0];
			}
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0][0].length; j++) {
				temp[i][0][j] = Math.min(temp[i - 1][0][j], temp[i][0][j - 1]) + arr[i][0][j];
			}
		}

		for (int i = 1; i < arr[0].length; i++) {
			for (int j = 1; j < arr[0][0].length; j++) {
				temp[0][i][j] = Math.min(temp[0][i - 1][j], temp[0][i][j - 1]) + arr[0][i][j];
			}
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				for (int k = 1; k < arr[0][0].length; k++) {
					temp[i][j][k] = Math.min(temp[i - 1][j][k], Math.min(temp[i][j - 1][k], temp[i][j][k - 1]))
							+ arr[i][j][k];
				}
			}
		}

		System.out.println(temp[temp.length - 1][temp[0].length - 1][temp[0][0].length - 1]);

	}

}
