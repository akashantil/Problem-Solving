package C14June27;

import java.util.Scanner;

public class ValidityOfSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		if (inp.charAt(0) < 'A' || inp.charAt(inp.length() - 1) != '.' || inp.charAt(0) > 'Z') {
			System.out.println("Invalid");
			return;
		}

		int prev = 0;
		int curr = 0;

		for (int i = 1; i < inp.length() - 1; i++) {
			char ch = inp.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				curr = 0;
			else if (ch >= 'a' && ch <= 'z')
				curr = 2;
			else if (ch == ' ')
				curr = 1;
			else if (ch == '.')
				curr = 3;

			if (prev == 0 && curr == 0) {
				System.out.println("Invalid");
				return;
			} else if (curr == 3) {
				System.out.println("Invalid");
				return;
			} else if (prev == 2 && curr == 0) {
				System.out.println("Invalid");
				return;
			}
			prev=curr;

		}
		System.out.println("Valid");

	}

}
