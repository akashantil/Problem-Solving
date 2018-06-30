package C15June28;

import java.util.Scanner;

public class ZigZagTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = sc.nextInt();

		for (int i = 0; i < row; i++) {

			int tr = i;
			int tc = 0;
			while (valid(tr, tc, row, col)) {
				System.out.print(arr[tr][tc] + " ");
				tr--;
				tc++;
			}
			System.out.println();

		}
		for (int i = 1; i < col; i++) {
			int tr = row - 1;
			int tc = i;
			while (valid(tr, tc, row, col)) {
				System.out.print(arr[tr][tc] + " ");
				tr--;
				tc++;
			}
			System.out.println();

		}

	}

	private static boolean valid(int tr, int tc, int row, int col) {
		// TODO Auto-generated method stub
		if (tr < 0 || tr >= row)
			return false;
		if (tc < 0 || tc >= col)
			return false;

		return true;
	}

}
