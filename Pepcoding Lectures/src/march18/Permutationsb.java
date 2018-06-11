package march18;

import java.util.ArrayList;

public class Permutationsb {

	public static void main(String[] args) {
		String s = "abc";

		ArrayList<String> sses = getPermutation(s);
		System.out.println(sses);
	}

	public static ArrayList<String> getPermutation(String str) {
		if (str.length() == 0) {
			ArrayList<String> res = new ArrayList<String>();
			res.add("");
			return res;
		}

		char ch = str.charAt(0);
		String rem = str.substring(1);

		ArrayList<String> res = getPermutation(rem);
		ArrayList<String> mres = new ArrayList<String>();

		for (String rstr : res) {

			StringBuilder sb = new StringBuilder(rstr);
			for (int i = 0; i <= rstr.length(); i++) {
				sb.insert(i, ch);
				mres.add(sb.toString());

			}
		}
		return mres;

	}
}
