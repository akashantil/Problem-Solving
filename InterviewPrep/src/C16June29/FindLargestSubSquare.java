package C16June29;

import java.util.Scanner;

public class FindLargestSubSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = row;

		char[][] arr = new char[row][col];

		boolean x = true;
		int rs = 0;
		int re = row - 1;
		int cs = 0;
		int ce = col - 1;
		int count = row;

		while (count > 0) {
			char ti = 'x';
			x = true;

			// marking first col
			for (int i = rs; i <= re && count > 0; i++) {
				if (arr[i][cs] != ti) {
					x = false;

				}

			}
			cs++;

			for (int i = cs; i <= ce && count > 0 && x != false; i++) {
				if (arr[re][i] != ti)
					x = false;

			}
			re--;
			for (int i = re; i >= rs && count > 0 && x != false; i--) {
				if (arr[i][ce] != ti)
					x = false;

			}

			ce--;
			for (int i = ce; i >= cs && count > 0 && x != false; i--) {
				if (arr[rs][i] != ti)
					x = false;

			}
			rs++;

			if (x == true) {
				System.out.println(count + 1);
				return;
			}

			count--;

		}

	}

}
