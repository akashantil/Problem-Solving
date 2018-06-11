package Recursion;

import java.util.HashSet;
import java.util.Scanner;

public class HasLongerPathThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int[][] arr = new int[x][x];

		for (int i = 0; i < y; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr[a][b] = c;
			arr[b][a] = c;
		}
		int src = sc.nextInt();
		int mcost = sc.nextInt();

		System.out.println(solve(arr, src, new HashSet<>(), 0, mcost));

	}

	public static boolean solve(int[][] arr, int node, HashSet<Integer> avail, int wsf, int mcost) {

		if (wsf >= mcost) {
			return true;
		}

		avail.add(node);

		for (int i = 0; i < arr.length; i++) {

			if (arr[node][i] != 0 && !avail.contains(i)) {

				boolean res = solve(arr, i, avail, wsf + arr[node][i], mcost);
				if (res == true)
					return true;
			}

		}
		avail.remove(node);

		return false;

	}

}
