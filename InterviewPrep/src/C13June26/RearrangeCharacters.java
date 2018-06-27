package C13June26;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RearrangeCharacters {

	public static class Pair implements Comparable<Pair> {
		int lpi;
		char ch;
		int freq;

		public Pair(int lpi, char ch, int freq) {
			this.lpi = lpi;
			this.ch = ch;
			this.freq = freq;
		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.freq - o.freq;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int k = sc.nextInt();

		int[] arr = new int[26];
		for (int i = 0; i < inp.length(); i++) {
			char ch = inp.charAt(i);
			arr[ch - 'a']++;

		}
		PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < 26; i++) {
			if (arr[i] != 0) {
				Pair a = new Pair(-1, (char) ('a' + i), arr[i]);

				pq.add(a);
			}

		}
		char[] res = new char[inp.length()];
		for (int i = 0; i < inp.length(); i++) {
			res[i] = '0';
		}
		int idx = 0;

		while (!pq.isEmpty()) {

			Pair temp = pq.remove();
			if (temp.lpi == -1) {
				res[idx] = temp.ch;
				temp.freq--;
				temp.lpi = idx;

			} else {
				int si = temp.lpi + k;
				if (si < inp.length() && res[si] == '0') {
					res[si] = temp.ch;
					temp.freq--;
					temp.lpi = si;

				} else if (si >= inp.length()) {
					System.out.println("Not Possible");
					return;

				}

				else {

					int l = si;
					while (l < inp.length()) {

						if (res[l] == '0') {
							res[l] = temp.ch;
							temp.freq--;
							temp.lpi = l;
							break;

						}
						l++;

					}
					if (l == inp.length()) {
						System.out.println("Not Possible");
						return;
					}
				}
			}

			if (temp.freq > 0)
				pq.add(temp);
			while (idx < inp.length() && res[idx] != '0')
				idx++;

		}
		String ans = "";

		for (int i = 0; i < res.length; i++) {
			ans += res[i];

		}
		System.out.println(ans);

	}

}
