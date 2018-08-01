package DpAndGreedy.class3;

import java.util.Scanner;

public class WildCardPatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		String patt = sc.next();

		boolean[][] res = new boolean[patt.length() + 1][ques.length() + 1];

		res[patt.length()][ques.length()] = true;

		for (int j = patt.length() - 1; j >= 0; j--) {
			char ch = patt.charAt(j);
			if (ch == '*') {
				res[j][ques.length()] = res[j + 1][ques.length()];
			}
		}

		for (int i = patt.length() - 1; i >= 0; i--) {
			char pc = patt.charAt(i);
			for (int j = ques.length() - 1; j >= 0; j--) {
				char qc = ques.charAt(j);

				if (pc == '+') {
					res[i][j] = res[i][j + 1] ||res[i+1][j+1];

				} else if (pc == '*') {
					res[i][j] = res[i + 1][j] || res[i][j + 1];

				}

				else if (pc == '?') {
					res[i][j] = res[i + 1][j + 1];

				} else {
					if (pc == qc) {
						res[i][j] = res[i + 1][j + 1];
					} else {
						res[i][j] = false;
					}

				}

			}
		}
		System.out.println(res[0][0]);

	}

}
