package C11;

import java.util.Scanner;

public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int no = sc.nextInt();
			System.out.println(reverse(no));
		}

	}

	public static int nod(int no) {
		

		int count = 0;
		while (no > 0) {
			count++;
			no /= 2;
		}
		return count;
	}

	public static int reverse(int inp) {

		int n = 32;
		int ans = 0;

		for (int i = 0; i < n; i++) {

			ans = (ans << 1) + (inp & 1);

			inp >>= 1;

		}
		return ans;

	}

}
