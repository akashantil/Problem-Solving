package BitMAnipulation;

import java.util.Scanner;

public class BinaryRepOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		int no=sc.nextInt();

		int bno = 0;
		int mult = 1;
		while (no > 0) {
			int rem = (no % 2);
			bno += rem * mult;
			mult *= 10;

			no /= 2;

		}
		System.out.println(bno);

	}

}
