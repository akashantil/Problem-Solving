package Stacks;

import java.util.LinkedList;

public class TimeForRottingOranges {

	public static class pair {
		int x;
		int y;

		pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };

		solve(arr);

	}

	public static void solve(int[][] arr) {
		LinkedList<pair> q = new LinkedList<>();
		int time = 0;

		q = fill(arr);

		while (!q.isEmpty()) {

			if (checkvalid(arr)) {
				++time;
				System.out.println("All Oranges can be rotted in " + time + " units");
				return;
			}

			pair x = q.removeFirst();
			if (x.x == -1) {
				time++;

				if (q.isEmpty() && checkvalid(arr) == false) {
					System.out.println("All Oranges can't be rotted");
					return;
				} else if (q.isEmpty() == false && checkvalid(arr) == false) {
					pair a = new pair(-1, -1);
					q.add(a);
				}
			} else {
				addall(q, x.x, x.y, arr);

			}

		}

	}

	public static boolean checkvalid(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 1)
					return false;

			}
		}
		return true;

	}

	public static LinkedList<pair> fill(int[][] arr) {

		LinkedList<pair> q = new LinkedList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 2) {
					pair a = new pair(i, j);
					q.add(a);
				}

			}
		}
		pair a = new pair(-1, -1);
		q.add(a);
		return q;

	}

	public static void addall(LinkedList<pair> q, int sx, int sy, int[][] arr) {

		int[] x = { 1, -1, 0, 0 };
		int[] y = { 0, 0, 1, -1 };

		for (int i = 0; i < 4; i++) {
			int oxaxis = sx;
			int oyaxis = sy;
			sx = sx + x[i];
			sy = sy + y[i];
			if (validforrotting(arr, sx, sy)) {
				arr[sx][sy] = 2;
				pair a = new pair(sx, sy);
				q.add(a);
			}

			sx = oxaxis;
			sy = oyaxis;

		}

	}

	public static boolean validforrotting(int[][] arr, int sx, int sy) {

		if (sx < 0 || sx >= arr.length || sy < 0 || sy >= arr[0].length || arr[sx][sy] == 0 || arr[sx][sy] == 2)
			return false;

		return true;

	}

}
