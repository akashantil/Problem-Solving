package Feb18;

public class ShellRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int rotations = 3;
		int sno = 2;

		ShellRotater(arr, sno, rotations);
		// TODO Auto-generated method stub

		System.out.println();
		System.out.println(" shell Rotated 2d array");
		Feb16.ArrayDisplay2d.Display(arr);

	}

	public static void ShellRotater(int[][] arr, int sno, int rot) {

		int rmin = 0 + sno - 1;
		int cmin = 0 + sno - 1;
		int rmax = arr.length - sno;
		int cmax = arr[0].length - sno;
		int tn = 2 * (rmax - rmin + cmax - cmin);
		int[] larr = new int[tn];
		int k = 0;

		while (tn > 0) {

			// left wall
			for (int i = rmin; i <= rmax && tn > 0; i++) {
				larr[k] = arr[i][cmin];
				tn--;
				k++;
			}

			cmin++;
			// bottom wall
			for (int j = cmin; j <= cmax && tn > 0; j++) {
				larr[k] = arr[rmax][j];
				k++;
				tn--;
			}
			rmax--;

			// right wall
			for (int i = rmax; i >= rmin && tn > 0; i--) {
				larr[k] = arr[i][cmax];
				k++;
				tn--;
			}
			cmax--;
			// top wall
			for (int j = cmax; j >= cmin && tn > 0; j--) {
				larr[k] = arr[rmin][j];
				k++;
				tn--;
			}
			rmin++;
		}
		System.out.println("linear array before rotation");
		for (int m = 0; m < k; m++) {
			System.out.print(larr[m] + " ");
		}
		System.out.println();

		Feb16.ArrayRotationSB.reversePartial(larr, 0, larr.length - rot - 1);
		Feb16.ArrayRotationSB.reversePartial(larr, (larr.length - rot), larr.length - 1);
		Feb16.ArrayRotationSB.reversePartial(larr, 0, larr.length - 1);
		System.out.println("linear array after rotation");
		for (int m = 0; m < k; m++) {
			System.out.print(larr[m] + " ");
		}

		rmin = 0 + sno - 1;
		cmin = 0 + sno - 1;
		rmax = arr.length - sno;
		cmax = arr[0].length - sno;
		tn = 2 * (rmax - rmin + cmax - cmin);

		k = 0;

		while (tn > 0) {

			// left wall
			for (int i = rmin; i <= rmax && tn > 0; i++) {
				arr[i][cmin] = larr[k];
				tn--;
				k++;
			}

			cmin++;
			// bottom wall
			for (int j = cmin; j <= cmax && tn > 0; j++) {
				arr[rmax][j] = larr[k];
				k++;
				tn--;
			}
			rmax--;

			// right wall
			for (int i = rmax; i >= rmin && tn > 0; i--) {
				arr[i][cmax] = larr[k];
				tn--;
			}
			cmax--;
			// top wall
			for (int j = cmax; j >= cmin && tn > 0; j--) {
				arr[rmin][j] = larr[k];
				tn--;
			}
			rmin++;
		}

	}
}