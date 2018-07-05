package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PassWordCracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int nop = sc.nextInt();
			HashSet<String> dict = new HashSet<>();
			for (int j = 0; j < nop; j++) {
				dict.add(sc.next());

			}
			String modPass = sc.next();

			ArrayList<String> ans = new ArrayList<>();

			boolean x = solve(dict, modPass, ans, "");
			if (x)
				System.out.println(ans);
			else
				System.out.println("WRONG PASSWORD");
		}

	}

	public static boolean solve(HashSet<String> dict, String modPAss, ArrayList<String> ans, String asf) {

		if (modPAss.length() == 0) {

			if (asf.length() == 0) {

				return true;
			}
			return false;

		}

		char ch = modPAss.charAt(0);
		String ros = modPAss.substring(1);

		String tc = asf + ch;
		if (dict.contains(tc)) {
			ans.add(tc);
			boolean x = solve(dict, ros, ans, "");
			if (x)
				return true;

			ans.remove(ans.size() - 1);
			boolean y = solve(dict, ros, ans, tc);
			if (y)
				return true;

		} else {
			boolean z = solve(dict, ros, ans, tc);
			if (z)
				return z;
		}

		return false;

	}

}
