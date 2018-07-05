package C11;

import java.util.Scanner;

public class CopySetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int x = sc.nextInt();

			int l = sc.nextInt();

			int r = sc.nextInt();
			int y = sc.nextInt();

			int maskLength = (1 << (r - l + 1)) - 1;

			// System.out.println(maskLength);

			// Shift the mask to the required position
			// "&" with y to get the set bits at between
			// l ad r in y
			int mask = ((maskLength) << (l - 1));

			// System.out.println(mask);
			mask &= y;
			x = x | mask;

			System.out.println(x);

		}
	}

}
