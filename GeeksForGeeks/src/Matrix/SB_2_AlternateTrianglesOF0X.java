package Matrix;


import java.util.Scanner;

public class SB_2AlternateTrianglesOF0X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		int rrow = 0;
		int ccol = 0;
		int rowlen = row;
		int collen = col;

		String[][] matrix = new String[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = "a";
			}

		}

		String cur = "X";

		while (rrow < rowlen && ccol < collen) {

			// down wall
			for (int i = rrow; i < rowlen; i++) {
				matrix[i][ccol] = cur;

			}
			// up wall
			for (int i = rrow; i < rowlen; i++) {
				matrix[i][collen - 1] = cur;

			}

			// right wall
			for (int i = ccol; i < collen; i++) {
				matrix[rrow][i] = cur;

			}
			// left
			for (int i = ccol; i < collen; i++) {
				matrix[rowlen - 1][i] = cur;

			}

			rrow++;
			ccol++;
			rowlen--;
			collen--;
			if (cur.equals("X"))
				cur = "0";
			else
				cur = "X";
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();

		}

	}

}
