package May30th;

import java.util.Arrays;

public class RearrangeCharDDistance {

	public static class pair implements Comparable<pair> {
		char ch;
		int freq;

		public pair(char ch, int freq) {
			this.ch = ch;
			this.freq = freq;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return o.freq - this.freq;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inp = "aaa";
		int d = 2;

		pair[] arr = new pair[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = new pair('1', 0);
		}

		for (int i = 0; i < inp.length(); i++) {
			char ch = inp.charAt(i);
			arr[ch - 'a'] = new pair(ch, arr[ch - 'a'].freq + 1);
		}
		Arrays.sort(arr);

		char[] result = new char[inp.length()];
		int x = 0;
		for (int i = 0; i < 26; i++) {

			int temp = x;
			while (arr[i].freq != 0) {

				if (temp < inp.length()) {
					result[temp] = arr[i].ch;
					arr[i] = new pair(arr[i].ch, arr[i].freq - 1);
					temp += d;
				} else {
					System.out.println("Invalid");
					return;
				}
			}
			x++;
		}
		String ans = "";
		for (int i = 0; i < result.length; i++) {
			ans += result[i];
		}
		System.out.println(ans);

	}

}
