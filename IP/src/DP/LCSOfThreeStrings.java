package DP;

import java.util.Scanner;

public class LCSOfThreeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();

		int[][][] arr = new int[a.length() + 1][b.length() + 1][c.length() + 1];

		for (int i = a.length() - 1; i >= 0; i--) {
			for (int j = b.length() - 1; j >= 0; j--) {
				for (int k = c.length() - 1; k >= 0; k--) {
					char x = a.charAt(i);
					char y = b.charAt(j);
					char z = c.charAt(k);

					if (x == y && x == z) {
						arr[i][j][k] = 1 + arr[i + 1][j + 1][k + 1];
					} else {
						arr[i][j][k] = Math.max(arr[i][j + 1][k], Math.max(arr[i + 1][j][k], arr[i][j][k + 1]));
					}

				}
			}
		}
		System.out.println(arr[0][0][0]);
	}

}
