package C16June29;

import java.util.Scanner;

public class ReplaceOwithX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char[][] arr = new char[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = sc.next().charAt(0);
		// for (int i = 0; i < row; i++)
		// for (int j = 0; j < col; j++)
		// if (arr[i][j] == 'O')
		// arr[i][j] = '.';

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				if (arr[i][j] == 'O')
					checkalladjacent(arr, i, j);
		//
		// for (int i = 0; i < row; i++) {
		// for (int j = 0; j < col; j++) {
		// if (arr[i][j] == 'F') {
		// arr[i][j] = 'X';
		// } else if (arr[i][j] == '.')
		// arr[i][j] = 'O';
		// }
		// }
		System.out.println("*********");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void checkalladjacent(char[][] arr, int i, int j) {

		if (nrv(arr, i, j) && ncv(arr, i, j) && prv(arr, i, j) && pcv(arr, i, j))
			arr[i][j] = 'X';

		// TODO Auto-generated method stub

	}

	private static boolean nrv(char[][] arr, int i, int j) {

		// TODO Auto-generated method stub

		if (i >= arr.length)
			return false;
		if (arr[i][j] == 'X')
			return true;

		if (arr[i][j] == 'O')
			return nrv(arr, i + 1, j);

		return false;
	}

	private static boolean prv(char[][] arr, int i, int j) {

		// TODO Auto-generated method stub

		if (i < 0)
			return false;
		if (arr[i][j] == 'X')
			return true;
		// if (j + 1 >= arr[0].length || j - 1 < 0)
		// return false;

		if ( arr[i][j] == 'O')
			return prv(arr, i - 1, j);

		return false;
	}

	private static boolean ncv(char[][] arr, int i, int j) {

		// TODO Auto-generated method stub
		if (j >= arr[0].length)
			return false;

		if (arr[i][j] == 'X')
			return true;

		if ( arr[i][j] == 'O')
			return ncv(arr, i, j + 1);

		return false;
	}

	private static boolean pcv(char[][] arr, int i, int j) {

		// TODO Auto-generated method stub
		if (j < 0)
			return false;

		if (arr[i][j] == 'X')
			return true;

		if ( arr[i][j] == 'O')
			return pcv(arr, i, j + 1);

		return false;
	}

}
