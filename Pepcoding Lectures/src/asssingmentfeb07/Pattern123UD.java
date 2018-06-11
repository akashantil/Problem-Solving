package asssingmentfeb07;

import java.util.Scanner;

public class Pattern123UD {

	public static void main(String[] args) {

		int n, t = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		n = sc.nextInt();
		boolean mirror = false;
		boolean down = false;
		int i, j, k, value = 1, count = 0, sp = (n - value) / 2, check = (n + 1) / 2;
		for (i = 1; i <= n; i++) {
			if (check < i) {
				down = true;
			}
			if (down == false) {
				for (j = 1; j <= sp; j++) {

					System.out.print("  ");
				}
				for (k = 1; k <= value; k++) {

					if (value == count) {

						mirror = true;
					}
					if (mirror == false) {

						count++;
						System.out.print("" + count + " ");

					} else {
						count--;
						System.out.print("" + count + " ");

					}
				}

				for (j = 1; j <= sp; j++) {
					System.out.print("  ");
				}
				value += 2;
				sp -= 1;
				mirror = false;
			} else {
				mirror=false;
				value = n - t;
				t = t + 2;
				count--;
				sp = (n - value) / 2;

				for (j = 1; j <= sp; j++) {
					System.out.print("  ");
				}
				for (k = 1; k <= value; k++) {

					if (value == count) {

						mirror = true;
					}
					if (mirror == false) {

						
						System.out.print("" + count + " ");
						count++;

					} else {
						
						System.out.print("" + count + " ");
						count--;

					}
				}

				for (j = 1; j <= sp; j++) {
					System.out.print("  ");
				}
				count++;

			}
			System.out.println();
		}

	}

}
