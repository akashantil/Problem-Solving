package C11;

import java.util.Scanner;

public class SwapAllOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int no = sc.nextInt();

			int bm1 = 0xAAAAAAAA;
			int bm2 = 0x55555555;

			bm1 = bm1 & no;
			bm2 = bm2 & no;
			bm1 >>= 1;
			bm2 <<= 1;
			System.out.println(bm1 | bm2);
		}

	}

}
