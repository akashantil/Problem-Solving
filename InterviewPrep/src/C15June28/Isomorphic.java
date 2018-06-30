package C15June28;

import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(solve(a, b));

	}

	public static boolean solve(String a, String b) {
		if (a.length() != b.length()) {

			return false;
		}
		HashMap<Character, Character> atb = new HashMap<>();
		HashMap<Character, Character> bta = new HashMap<>();

		atb.put(a.charAt(0), b.charAt(0));
		bta.put(b.charAt(0), a.charAt(0));

		for (int i = 1; i < a.length(); i++) {
			char ca = a.charAt(i);
			char cb = b.charAt(i);

			if (atb.containsKey(ca)) {
				if (cb != atb.get(ca))
					return false;

				if (ca != bta.get(cb))
					return false;
			} else {
				if (bta.containsKey(cb)) {
					if (ca != bta.get(cb))
						return false;
				}

				atb.put(ca, cb);
				bta.put(cb, ca);
			}

		}
		return true;

	}

}
