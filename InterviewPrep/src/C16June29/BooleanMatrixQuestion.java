package C16June29;

import java.util.Scanner;

public class BooleanMatrixQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for(int a=0;a<not;a++){
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = sc.nextInt();

		boolean rowflag = false;
		boolean colflag = false;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 && arr[i][j] == 1)
					rowflag = true;
				if (j == 0 && arr[i][j] == 1)
					colflag = true;

				if (arr[i][j] == 1) {
					arr[0][j] = 1;
					arr[i][0] = 1;
				}

			}
		}
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (arr[0][j] == 1 || arr[i][0] == 1)
					arr[i][j] = 1;
			}
		}

		if (rowflag) {
			for (int i = 0; i < col; i++) {
				arr[0][i] = 1;
			}
		}
		if (colflag) {

			for (int i = 0; i < row; i++) {
				arr[i][0] = 1;
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
		}
	}
	}

}
