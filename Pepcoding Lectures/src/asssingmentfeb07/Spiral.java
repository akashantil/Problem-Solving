package asssingmentfeb07;

import java.util.Scanner;

public class Spiral {

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
		SpiralPrinter1(arr);
		System.out.println();
		SpiralPrinter2(arr);

	}

	public static void SpiralPrinter1(int[][] arr) {
		int rmin = 0, cmin = 0;
		int rmax = arr.length;
		int cmax = arr[0].length;
		int count = rmax * cmax;
		while (count > 0) {
			// top wall
			for (int col = cmin; col < cmax; col++) {
				if (count > 0) {
					System.out.print(arr[rmin][col] + " ");
					count--;
				}
			}
			rmin++;

			// right wall
			for (int row = rmin; row < rmax; row++) {
				if (count > 0) {
					System.out.print(arr[row][cmax - 1] + " ");
					count--;
				}
			}
			cmax--;
			// bottom wall
			for (int col = cmax - 1; col >= cmin; col--) {
				if (count > 0) {
					System.out.print(arr[rmax - 1][col] + " ");
					count--;
				}
			}
			rmax--;
			// left wall
			for (int row = rmax - 1; row >= rmin; row--) {
				if (count > 0) {
					System.out.print(arr[row][cmin] + " ");
					count--;
				}
			}
			cmin++;
		}
	}

	public static void SpiralPrinter2(int[][] arr) {
		int rmin = 0, cmin = 0;
		int rmax = arr.length;
		int cmax = arr[0].length;
		int count = rmax * cmax;
		while (count > 0) {

			// left wall
			for (int row = rmin; row < rmax; row++) {
				if (count > 0) {
					System.out.print(arr[row][cmin] + " ");
					count--;
				}
			}
			cmin++;
			// bottom wall
			for (int col = cmin; col<cmax; col++) {
				if (count > 0) {
					System.out.print(arr[rmax - 1][col] + " ");
					count--;
				}
			}
			rmax--;
			// right wall
			for (int row = rmax-1; row >=rmin; row--) {
				if (count > 0) {
					System.out.print(arr[row][cmax - 1] + " ");
					count--;
				}
			}
			cmax--;
			// top wall
			for (int col = cmax-1; col >= cmin; col--) {
				if (count > 0) {
					System.out.print(arr[rmin][col] + " ");
					count--;
				}
			}
			rmin++;

		}
	}

}
