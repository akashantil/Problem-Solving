package feb07;

import java.util.Scanner;

public class Reversing {

	public static void main(String[] args) {
		int n;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		n = scn.nextInt();
		int rev=0, rem;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;

		}
		System.out.println(rev);
	}

}
