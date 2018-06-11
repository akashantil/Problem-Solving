package feb08;

import java.util.Scanner;

public class OctalSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first octal no");
		n1 = sc.nextInt();

		int n2;
		//only one scanner is enough as object created once can be used again
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter second octal");
		n2 = sc.nextInt();
		int sub = 0, r1, r2, j = 1, fsub = 0, borrow = 0;

		while (n1 != 0 || n2 != 0) {

			r1 = n1 % 10;
			r2 = n2 % 10;
			if (r1 + borrow >= r2) {
				sub = r1 + borrow - r2;
				borrow = 0;
			} else {
				sub = r1 + borrow + 8 - r2;
				borrow = -1;
			}
			n1 = n1 / 10;
			n2 = n2 / 10;
			fsub = fsub + sub * j;
			j = j * 10;
		}

		System.out.println(fsub);
	}

}
