package Matrix;

import java.util.Scanner;

public class FillXorO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		char[][] arr = new char[x][y];

		boolean flag = true;

		int noe = x * y;
		int mrow = 0;
		int mcol = 0;
		int maxrow = x - 1;
		int maxcol = y - 1;

		while (noe > 0) {

			for (int i = mrow; i <= maxrow && noe > 0; i++) {
				arr[i][mcol] = (flag == true ? 'X' : 'O');
				noe--;

			}
			mcol++;

			for (int i = mcol; i <= maxcol && noe > 0; i++) {
				arr[maxrow][i] = (flag == true ? 'X' : 'O');
				noe--;

			}
			maxrow--;

			for (int i = maxrow; i >= mrow && noe > 0; i--) {
				arr[i][maxcol] = (flag == true ? 'X' : 'O');
				noe--;

			}
			maxcol--;

			for (int i = maxcol; i >= mcol && noe > 0; i--) {
				arr[mrow][i] = (flag == true ? 'X' : 'O');
				noe--;

			}
			mrow++;

			flag = !flag;

		}
		for (int j = 0; j < x; j++) {
			for (int k = 0; k < y; k++) {
				System.out.print(arr[j][k] + " ");
			}
			System.out.println();
		}

	}

}
