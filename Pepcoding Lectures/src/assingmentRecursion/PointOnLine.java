package assingmentRecursion;

import java.util.Scanner;

public class PointOnLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		boolean xa = false;
		boolean ya = false;
		int x = sc.nextInt();
		int y = sc.nextInt();
		for (int i = 1; i < n; i++) {
			int z = sc.nextInt();
			int w = sc.nextInt();
			if (x == z) {
				xa = true;
			} else if (y == w) {
				ya = true;

			} else if (x != z && y != w) {
				System.out.println("NO");
				return;
			} else if (ya == false && xa == true && x != z) {
				System.out.println("NO");
				return;

			} else if (ya == true && xa == false && y != w) {
				System.out.println("NO");
				return;
			} else if (xa == true && ya == true && y != w && x == z) {
				ya = false;
			} else if (xa == true && ya == true && y == w && x != z) {
				xa = false;
			} else if (xa == true && ya == true && y != w && x != z) {
				System.out.println("NO");
				return;
			}

		}
		System.out.println("YES");

	}

}
