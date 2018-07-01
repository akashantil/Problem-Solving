package C16June29;

import java.util.Scanner;

public class FindSpecificPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = sc.nextInt();

		int[][] max = new int[row][col];
		max[row - 1][col - 1] = arr[row - 1][col - 1];

		for (int i = row - 2; i >= 0; i--) {
			max[i][col - 1] = Math.max(arr[i][col - 1], max[i + 1][col - 1]);
		}
		for (int i = col - 2; i >= 0; i--) {
			max[row - 1][i] = Math.max(arr[row - 1][i], max[row - 1][i + 1]);
		}

		int maxdiff = Integer.MIN_VALUE;

		for (int i = row - 2; i >= 0; i--) {
			for (int j = col - 2; j >= 0; j--) {

				if (max[i + 1][j + 1] - arr[i][j] > maxdiff) {
					maxdiff = max[i + 1][j + 1] - arr[i][j];
				}

				max[i][j] = Math.max(arr[i][j], Math.max(max[i + 1][j], max[i][j + 1]));

			}
		}
		System.out.println(maxdiff);

	}

}
