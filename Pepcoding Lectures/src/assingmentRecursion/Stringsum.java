package assingmentRecursion;

import java.util.Scanner;

public class Stringsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;

		Scanner sc = new Scanner(System.in);

		s = sc.next();
		int sum = sumOfstring(s, 0);

		System.out.println(sum);

	}

	public static int sumOfstring(String s, int idx) {
		if (idx == s.length()) {
			return 0;
		}
		char x = (s.charAt(idx));
		char sum = (char) (x + (sumOfstring(s, idx + 1)));
		return Math.abs(sum - '1' + 1);

	}

}
