package C11;

import java.util.Scanner;

public class PositionofOnlySetBit {

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

		if ((no & (no - 1)) != 0) {
			System.out.println("Invalid");
			return;
		}
		int count = 1;
		while (no >= 0) {
			if (no % 2 == 1) {
				System.out.println(count);
				return;
			}
			count++;
			no /= 2;

		}

	}

}
