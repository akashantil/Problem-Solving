package feb08;

import java.util.Scanner;

public class AnytoAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sn;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to convert");
		sn = sc.nextInt();
		int sb;
		System.out.println("Base of  no to be converted");
		sb = sc.nextInt();
		int db;

		System.out.println("Enter destination base");
		db = sc.nextInt();

		int i, dn = 0, rem, j = 1;
		while (sn != 0) {
			rem = sn % db;
			dn = dn + rem * j;
			j = j * sb;
			sn = sn / db;
		}

		System.out.println(dn);
	}

}
