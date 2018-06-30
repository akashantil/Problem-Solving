package C14June27;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringsContainingKUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int k = sc.nextInt();

		HashMap<Character, Integer> window = new HashMap<>();
		int si = 0;
		int osi = 0;
		int len = 0;
		int ol = 0;

		for (int i = 0; i < k; i++) {
			char ch = inp.charAt(i);
			window.put(ch, window.containsKey(ch) ? window.get(ch) + 1 : 1);
			if (window.size() <= k) {
				len = i - si;
			}
		}
		osi = si;
		ol = len;

		for (int i = k; i < inp.length(); i++) {

			char ch = inp.charAt(i);
			window.put(ch, window.containsKey(ch) ? window.get(ch) + 1 : 1);

			if (window.size() <= k) {
				len = i - si;
				if (len > ol) {
					ol = len;
					osi = si;

				}
			} else {
				char rh = inp.charAt(si);
				if (window.get(rh) - 1 > 0) {
					window.put(rh, window.get(rh) - 1);

				} else
					window.remove(rh);

				si++;

			}

			if (window.size() <= k) {
				len = i - si;
				if (len > ol) {
					ol = len;
					osi = si;

				}
			}

		}
		for (int i = 0; i <= ol; i++) {
			System.out.print(inp.charAt(osi + i));
		}

	}

}
