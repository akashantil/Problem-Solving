package march18;

import java.util.ArrayList;

public class RecursionQuesAns {

	public static void main(String[] args) {

		String s = "abab";
		PermutationandDuplicacy(s, "");
		// TODO Auto-generated method stub

		// BoardPath(0, 10, "");

	}

	public static void subsequenceWithAscii(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		subsequenceWithAscii(roq, ans + ch);
		subsequenceWithAscii(roq, ans + (int) (ch));
		subsequenceWithAscii(roq, "" + ans);

	}

	static String[] codes = { "abc", "de", "fgh", "ijkl", "m", "nop", "qrs", "tuv", "wxyz", "." };

	public static void KeyPad(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		String tc = codes[ch - '0'];
		for (int i = 0; i < tc.length(); i++) {
			KeyPad(roq, ans + tc.charAt(i));

		}

	}

	public static void Permutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		for (int i = 0; i <= ans.length(); i++) {
			StringBuilder sb = new StringBuilder(ans);
			sb.insert(i, ch);
			Permutation(roq, sb.toString());
		}

	}

	public static void BoardPath(int src, int dest, String asf) {
		if (src == dest) {
			System.out.println(asf);
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {
			int i = src + dice;

			if (i <= dest) {
				BoardPath(i, dest, asf + dice);
			}
		}

	}

	public static void PermutationandDuplicacy(String ques, String ans) {
		int[] arr = new int[26];
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);

			String bp = "", ap = "";
			bp += ques.substring(0, i);
			ap = ques.substring(i + 1);
			String ros = bp + ap;

			if (arr[ch - 'a'] == 0) {
				arr[ch - 'a']++;
				PermutationandDuplicacy(ros, ans + ch);
			}

		}

	}

}
