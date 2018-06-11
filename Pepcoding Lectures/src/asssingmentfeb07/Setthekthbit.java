package asssingmentfeb07;

import java.util.Scanner;

public class Setthekthbit {

	public static void main(String[] args) {
		int n;
		int k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		// converting to binary
		int mult = 1;
		int bno = 0;
		while (n > 0) {
			int rem = n % 2;
			rem = rem * mult;
			bno = bno + rem;
			mult *= 10;
			n /= 2;
		}
		System.out.println(bno);
		k = 1 << k;
		 System.out.println(k);
		
		n = k ^ n;
		System.out.println(k);
		System.out.println(n);

		// TODO Auto-generated method stub

	}

}
