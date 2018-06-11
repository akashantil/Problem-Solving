package feb08;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sn;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to convert to binary");
		sn = sc.nextInt();
		int i, sb = 10, db = 2, dn = 0, rem, j = 1;
		while (sn != 0) {
			rem = sn % db;
			dn = dn + rem * j;
			j = j * 10;
			sn = sn / db;
		}

		System.out.println(dn);
	}

}
