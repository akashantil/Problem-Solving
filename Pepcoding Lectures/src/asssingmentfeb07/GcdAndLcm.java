package asssingmentfeb07;

import java.util.Scanner;

public class GcdAndLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		gcdAndlcm(n1, n2);

	}

	public static void gcdAndlcm(int n1, int n2) {
		int no1 = n1;
		int no2 = n2;
		int gcd = 1;
		int lcm = 1;
		int i = 2;

		while (i < n1 && i < n2) {
			if (no1 % i == 0 && no2 % i == 0) {
				no1 /= i;
				no2 /= i;
				gcd *= i;
				i = 2;
			} else {
				i++;
			}
		}
		i = 2;
		while ((n1 != 0 || n2 != 0) && (i <= n1 || i <= n2)) {

			if (n1 % i == 0 && n2 % i == 0) {

				n1 /= i;
				n2 /= i;
				lcm *= i;
				i = 2;
			}

			else if (n1 % i == 0 && n2 % i != 0) {
				n1 /= i;
				lcm *= i;
				i++;

			} else if (n2 % i == 0 && n1 % i != 0) {
				n2 /= i;
				lcm *= i;
				i++;
			} else {
				i++;
			}
		}
		System.out.println(gcd + " " + lcm);

	}

}
