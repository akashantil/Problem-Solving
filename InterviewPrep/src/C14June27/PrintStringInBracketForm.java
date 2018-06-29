package C14June27;

import java.util.Scanner;

public class PrintStringInBracketForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();

		solve(inp, "");

	}

	public static void solve(String inp, String asf) {

		if (inp.length() == 0) {
			System.out.println(asf);
			return;
		}
		for (int i = 1; i <= inp.length(); i++) {

			String ans = inp.substring(0, i);
			String roq = inp.substring(i);
			solve(roq, asf + "(" + ans + ") ");
		}

	}
}
