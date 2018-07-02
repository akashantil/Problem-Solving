package C10;

import java.util.Scanner;

public class GenerateAllBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		StringBuilder sb = new StringBuilder(inp);
//		System.out.println(sb);
		solve(sb, 0);

	}

	public static void solve(StringBuilder sb, int i) {
		if (i == sb.length()) {
			System.out.println(sb);
			return;
		}

		char ch = sb.charAt(i);

		if (ch == '?') {
			sb.setCharAt(i, '0');
			solve(sb, i + 1);
			sb.setCharAt(i, '1');
			solve(sb, i+1);
			
			sb.setCharAt(i, '?');

		} else
			solve(sb, i + 1);

	}

}
