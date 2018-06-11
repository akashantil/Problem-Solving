package feb08;

import java.util.Scanner;

public class BinarytoDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sn;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary no to convert to decimal");
		sn = sc.nextInt();
		int i, sb = 2, db = 10, dn = 0, rem, j = 1;
		while (sn != 0) {
			rem = sn % db;
			dn = dn + rem * j;
			j = j * 2;
			sn = sn / db;
		}

		System.out.println(dn);
	}

}
