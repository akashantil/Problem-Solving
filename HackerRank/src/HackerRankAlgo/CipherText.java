package HackerRankAlgo;

import java.util.Scanner;

public class CipherText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String s;
		int d;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.next();
		d = sc.nextInt();
		d=d%26;
		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < n; i++) {
			char x = s.charAt(i);
			if ((x >= 'a' && x <= 'z')) {
				if ((x + d) <='z' ) {
					x = (char) ((x + d));
					sb.append(x);
				} else {
					int diff = ((x + d) - 'z');
					char ch = (char) ('a' + diff - 1);
					sb.append(ch);

				}
			} else if (x >= 'A' && x <= 'Z') {
				if ((x + d) <='Z') {
					x = (char) ((x + d));
					sb.append(x);
				} else {
					int diff = (x + d - 'Z');
					if ('A' + diff - 1 < 'Z') {
						char ch = (char) ('A' + diff - 1);
						sb.append(ch);
					}

				}
			} else {
				sb.append(x);
			}
		}
		System.out.println(sb);

	}

}
