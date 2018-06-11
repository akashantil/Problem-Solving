package REvision;

import java.util.ArrayList;

public class allPAlindromicPartitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inp = "bcc";
		int[] taken = new int[inp.length()];
		solve(inp, 0, "", new ArrayList<>(), taken);

	}

	public static void solve(String inp, int idx, String prefix, ArrayList<String> res, int[] taken) {

		if (idx == inp.length()) {
			if (isValid(inp, res))
				System.out.println(res);
			return;
		}

		prefix += inp.charAt(idx);

		if (palindrome(prefix)) {
			taken[idx] = 1;
			res.add(prefix);
			prefix = "";
			solve(inp, idx + 1, prefix, res, taken);

			String a = res.remove(res.size() - 1);
			prefix = a;

			solve(inp, idx + 1, prefix, res, taken);

		} else {
			solve(inp, idx + 1, prefix, res, taken);
		}

	}

	public static boolean palindrome(String inp) {

		int i = 0;
		int j = inp.length() - 1;
		while (i <= j) {
			if (inp.charAt(i) != inp.charAt(j))
				return false;

			i++;
			j--;
		}
		return true;
	}

	public static boolean isValid(String inp, ArrayList<String> res) {
		int fes = 0;
		for (int i = 0; i < res.size(); i++) {
			String a = res.get(i);
			fes += a.length();

		}
		if (fes == inp.length())
			return true;

		return false;
	}

}
