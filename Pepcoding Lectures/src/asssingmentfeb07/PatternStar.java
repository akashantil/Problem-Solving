package asssingmentfeb07;

import java.util.Scanner;

public class PatternStar {

	public static void main(String[] args) {

		int n;
		boolean up = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		n = sc.nextInt();
		int i, j, k, count = 1, sp = (n - count) / 2;
		int t=2;

		for (i = 1; i <= n; i++) {

			if (up == true) {
				for (j = sp; j >= 1; j--) {
					System.out.print(" ");
				}
				for (k = 1; k <= count && k <= n; k++) {
					System.out.print("*");
				}
				count += 2;
				System.out.println();
				if (count > n)
					up = false;

				sp = (n - count) / 2;
			} else {
				count =n-t;
				sp = (n - count) / 2;

				for (j = sp; j >= 1; j--) {
					System.out.print(" ");

				}
				for (k = count; k >= 1; k--) {
					System.out.print("*");
				}
				// count = count - 2;
				sp = (n - count) / 2;
				t=t+2;

				System.out.println();
			}
		}

	}

}
