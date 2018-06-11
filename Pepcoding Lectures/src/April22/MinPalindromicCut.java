package April22;

import java.util.Scanner;

public class MinPalindromicCut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();

		boolean[][] pal = new boolean[inp.length()][inp.length()];
		int[][] cut = new int[inp.length()][inp.length()];
		char[] arr = inp.toCharArray();

		// System.out.println( mpct(pal, cut, arr));
		System.out.println(mpcm(arr, 0, arr.length - 1, new int[arr.length][arr.length]));
	}

	static int counter = 0;

	public static int mpct(boolean[][] pal, int[][] cut, char[] arr) {
		for (int i = pal.length - 1; i >= 0; i--) {
			for (int j = pal.length - 1; j >= 0; j--) {
				if (i == j) {
					pal[i][j] = true;
				} else if (i > j)
					pal[i][j] = false;

				else if (j - i == 1 && arr[i] == arr[j]) {
					pal[i][j] = true;

				} else {
					if (arr[i] == arr[j] && pal[i + 1][j - 1] == true)
						pal[i][j] = true;
					else
						pal[i][j] = false;
				}

			}
		}

		for (int i = pal.length - 1; i >= 0; i--) {
			for (int j = 0; j < pal.length; j++) {
				if (pal[i][j] == true) {
					cut[i][j] = 0;

				} else if (i > j)
					cut[i][j] = -1;

				else if (j - i == 1) {
					cut[i][j] = 1;

				} else {
					int a = 1 + cut[i + 1][j];
					int b = 1 + cut[i][j - 1];
					cut[i][j] = Math.min(a, b);
				}

			}
		}
		return cut[0][cut.length - 1];

	}

	public static int mpcm(char[] arr, int si, int ei, int[][] qb) {

		if (isPalindromic(arr, si, ei) == true) {
			return 0;
		}

		if (qb[si][ei] != 0)
			return qb[si][ei];

		counter++;
		System.out.println("Call NO -> ." + counter);

		int mc = Integer.MAX_VALUE;
		for (int i = si; i < ei; i++) {

			int p1c = mpcm(arr, si, i, qb);
			int p2c = mpcm(arr, i + 1, ei, qb);

			int tc = p1c + p2c + 1;
			if (tc < mc)
				mc = tc;

		}
		qb[si][ei] = mc;
		return mc;

	}

	public static boolean isPalindromic(char[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int left = si;
		int right = ei;
		while (left < right) {
			if (arr[left] != arr[right])
				return false;
			left++;
			right--;
		}
		return true;
	}
}
