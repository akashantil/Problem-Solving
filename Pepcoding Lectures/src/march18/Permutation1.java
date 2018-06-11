package march18;

import java.util.ArrayList;

public class Permutation1 {

	public static void main(String[] args) {
		String a = "abcd";
		ArrayList<String> result = permutationwithoutduplicates(a);
		System.out.println(result);
		System.out.println(result.size());
		// TODO Auto-generated method stub

	}

	public static ArrayList<String> permutationwithoutduplicates(String s) {
		if (s.length() == 0) {
			ArrayList<String> ab = new ArrayList<String>();
			ab.add("");
			return ab;
		}

		char ch = s.charAt(0);
		String ros = s.substring(1);

		ArrayList<String> result = permutationwithoutduplicates(ros);
		ArrayList<String> myres = new ArrayList<String>();

		for (String rstr : result) {

			for (int i = 0; i <= rstr.length(); i++) {
				StringBuilder sb = new StringBuilder(rstr);
				sb.insert(i, ch);
				myres.add(sb.toString());

			}
		}

		return myres;

	}

}
