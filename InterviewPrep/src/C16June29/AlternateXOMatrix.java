package C15June28;

import java.util.Scanner;

public class AlternateXOMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		char[][] arr = new char[row][col];

		boolean x = true;
		int rs = 0;
		int re = row - 1;
		int cs = 0;
		int ce = col - 1;
		int count = row * col;

		while (count > 0) {
			char ti = '/';
			if (x == true)
				ti = 'X';
			else
				ti = 'O';

			// marking first col
			for (int i = rs; i <= re && count > 0; i++) {
				arr[i][cs] = ti;
				count--;
			}
			cs++;

			for (int i = cs; i <= ce && count > 0; i++) {
				arr[re][i] = ti;
				count--;
			}
			re--;
			for (int i = re; i >= rs && count > 0; i--) {
				arr[i][ce] = ti;
				count--;
			}

			ce--;
			for (int i = ce; i >= cs && count > 0; i--) {
				arr[rs][i] = ti;
				count--;
			}
			rs++;

			x = !x;

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				System.out.print(arr[i][j] + " ");

			System.out.println();
		}

	}

}
