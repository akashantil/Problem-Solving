package C06July19;

import java.util.Scanner;

public class Countnoofsetbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		int nos = 0;

		while (no > 0) {
			if (no % 2 == 1)
				nos++;
			no /= 2;
		}
		System.out.println(nos);

	}

}
