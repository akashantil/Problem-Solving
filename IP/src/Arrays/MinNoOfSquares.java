package Arrays;

import java.util.Scanner;

public class MinNoOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] qb = new int[x + 1][y + 1];
		System.out.println(min(x, y, qb));

	}

	

	public static int min(int x, int y, int[][] qb) {

		if (x == y)
			return 1;

		if (x == 1)
			return y;
		if (y == 1)
			return x;

		if (qb[x][y] != 0)
			return qb[x][y];

		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		for (int i = 1; i <= x / 2; i++) {

			a = Math.min(min(i, y, qb) + min(x - i, y, qb), a);

		}
		for (int i = 1; i <= y / 2; i++) {

			a = Math.min(min(x, i, qb) + min(x, y - i, qb), a);

		}

		qb[x][y] = Math.min(a, b);
		return qb[x][y];

	}

}
