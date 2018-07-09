package C11;

import java.util.Scanner;

public class SwapNibbles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int no = sc.nextInt();

			System.out.println(solve(no));
		}
	}

	public static int solve(int no) {
		int bm1 = 15;
		int bm2 = 240;
		// System.out.println(Integer.toBinaryString(bm1));
		// System.out.println(Integer.toBinaryString(bm2));
		int suffix = no & bm1;
		int prefix = no & bm2;

		prefix >>= 4;
		suffix <<= 4;

		return prefix | suffix;

	}

}
