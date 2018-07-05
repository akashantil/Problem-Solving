package C10;

import java.util.HashMap;
import java.util.Scanner;

public class SmallestWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int n = 0; n < not; n++) {
			String inp = sc.next();

			HashMap<Character, Integer> fmap = new HashMap<>();
			HashMap<Character, Integer> window = new HashMap<>();

			for (int i = 0; i < inp.length(); i++) {
				char ch = inp.charAt(i);
				fmap.put(ch, fmap.containsKey(ch) ? fmap.get(ch) + 1 : 1);

			}
			int ws = fmap.size();
			int j = 0;

			int wl = Integer.MAX_VALUE;
			int i = 0;

			while (i < inp.length()) {

				if (window.size() < ws) {
					char ch = inp.charAt(i);
					window.put(ch, window.containsKey(ch) ? window.get(ch) + 1 : 1);
					i++;
					if (window.size() == ws)
						i--;
				}

				else {
					char ch = inp.charAt(j);
					window.put(ch, window.get(ch) - 1);
					if (window.get(ch) <= 0) {
						window.remove(ch);
					}
					j++;

					if (window.size() != ws)
						i++;

				}

				if (window.size() == ws) {
					if (wl > i - j + 1)
						wl = i - j + 1;
				}

			}
			System.out.println(wl);

		}
	}

}
