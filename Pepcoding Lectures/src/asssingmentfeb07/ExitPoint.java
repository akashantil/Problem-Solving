package asssingmentfeb07;

import java.util.Scanner;

public class ExitPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		int c;
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		int[][] arr = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		exitPoint(arr);


	}
	public static void exitPoint(int[][] arr) {
			}

}
