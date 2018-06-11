package Recursion;

import java.util.HashMap;
import java.util.Scanner;

public class MatchPatternAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String ques = sc.nextLine();
		String patt = sc.nextLine();

		HashMap<Character, String> map = new HashMap<>();

		if (solve(ques, patt, map, 0)) {
			System.out.println(map);
		} else {
			System.out.println("No Solution Exist");
		}
	}
	// ques.substring(0,i);ques.substring(i+1);

	public static boolean solve(String ques, String patt, HashMap<Character, String> map, int idx) {

		boolean flag = false;
		boolean res = false;
		if (idx == patt.length() && ques.length() == 0) {

			return true;
		}
		if (idx == patt.length())
			return false;

		for (int i = 1; i <= ques.length(); i++) {
			String mtp = "";
			String ros = "";
			char ch = patt.charAt(idx);
			if (map.containsKey(ch) == false) {
				mtp = ques.substring(0, i);
				ros = ques.substring(i);
				map.put(ch, mtp);
				flag = true;
			} else {
				String pim = map.get(ch);

				String pis = "";
				if (ques.length() >= pim.length())
					pis = ques.substring(0, pim.length());
				else
					return false;
				
				if (pim.equals(pis)) {
					ros = ques.substring(pim.length());
				} else {
					return false;
				}

			}
			res = solve(ros, patt, map, idx + 1);
			if (res)
				return true;

			if (flag == true)
				map.remove(ch);

		}
		return res;

	}

}
