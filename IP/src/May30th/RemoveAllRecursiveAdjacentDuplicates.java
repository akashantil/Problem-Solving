package May30th;

import java.util.Scanner;

public class RemoveAllRecursiveAdjacentDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {

			String inp = sc.nextLine();

			String ans = solve(inp, 0);
			if (ans.length() == 0) {
				System.out.println("Empty String");
			} else if (ans.length() == 2) {
				if (ans.charAt(0) == ans.charAt(1)) {
					System.out.println("Empty String");
				} else
					System.out.println(ans);
			} else {
				System.out.println(ans);
			}
		}

	}

	static boolean cts = false;

	public static String solve(String inp, int idx) {

		if (idx + 1 == inp.length()) {
			String ans = inp.charAt(inp.length() - 1) + "";
			return ans;
		}

		char x = inp.charAt(idx);

		String ans = solve(inp, idx + 1);

		if (cts == false && x != ans.charAt(0)) {
			ans = x + ans;
		} else if (x == ans.charAt(0)) {
			cts = true;
		}

		else if (cts == true && x != ans.charAt(0)) {
			ans = ans.substring(1);
			ans = x + ans;
			cts = false;
		}

		return ans;
	}

}
