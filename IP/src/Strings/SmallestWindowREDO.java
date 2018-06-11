package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SmallestWindowREDO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String ques = sc.next();

		HashSet<Character> ucs = new HashSet<>();
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (ucs.contains(ch) == false)
				ucs.add(ch);

		}
		HashSet<Character> cws = new HashSet<>();

		int ws = ucs.size();

		int mwl = Integer.MAX_VALUE;

		int[] fmap = new int[26];

		for (int i = 0; i < ws; i++) {
			char ch = ques.charAt(i);
			fmap[ch - 'a']++;
			if (cws.contains(ch) == false)
				cws.add(ch);
		}
		if (cws.equals(ucs)) {
			System.out.println(ws);
			return;
		}

		int i = 0;
		int j = ws;
		boolean found = false;
		while (j < ques.length()) {

			if (found == false) {
				char ch = ques.charAt(j);
				fmap[ch - 'a']++;
				if (cws.contains(ch) == false)
					cws.add(ch);
				if (cws.equals(ucs)) {
					if (j - i+1 < mwl)
						mwl = j - i+1;
					found = true;
					j--;
				}
				j++;

			} else {
				char ch = ques.charAt(i);
				fmap[ch - 'a']--;
				if (fmap[ch - 'a'] == 0) {
					cws.remove(ch);
					found = false;
				} else {
					if (j - i+1 < mwl)
						mwl = j - i+1;

				}
				i++;

			}
		}
		System.out.println(mwl);

	}

	public static boolean checkvalidwindow(HashMap<Character, Integer> map, HashSet<Character> ucs) {
		// TODO Auto-generated method stub

		return false;
	}

}
