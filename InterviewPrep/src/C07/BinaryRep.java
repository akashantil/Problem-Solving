package C11;

import java.util.Scanner;

public class BinaryRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int no = sc.nextInt();
			solve(no);

		}
	}

	public static void solve(int no) {
		String ans = "";
		int count = 14;

		while (count > 0) {
			int rem = no % 2;
			ans = rem + ans;
			no /= 2;
			count--;
		}

		// System.out.println(ans.length());
		System.out.println(ans);
		return;

	}

}
