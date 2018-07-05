package C11;

import java.util.Scanner;

public class FlipBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int res = x ^ y;
		
		System.out.println(solve(res));

	}

	public static int solve(int no) {
		int count = 0;

		while (no > 0) {
			if (no % 2 == 1)
				count++;
			no /= 2;
		}
		return count;
	}

}
