package Strings;

import java.util.Collections;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ReArrangeCharacters {

	public static class pair implements Comparable<pair> {
		char ch;
		int count;

		pair(char ch, int count) {
			this.ch = ch;
			this.count = count;
		}

		@Override
		public int compareTo(pair o) {
			if (this.count != o.count)
				return this.count - o.count;
			else {
				return o.ch-this.ch;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ab = sc.next();

		int[] fmap = new int[26];
		for (int i = 0; i < ab.length(); i++) {
			char ch = ab.charAt(i);
			fmap[ch - 'a']++;
		}
		PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < 26; i++) {
			if (fmap[i] != 0) {
				pair x = new pair((char) ('a' + i), fmap[i]);
				pq.add(x);
			}

		}
		String ans = "";
		pair prev = new pair('z', 0);
		pair curr = new pair('z', 0);
		while (!pq.isEmpty()) {
			curr = pq.remove();
			ans += curr.ch;
			curr = new pair(curr.ch, curr.count - 1);

			if (prev.count > 0)
				pq.add(prev);
			prev = curr;

		}
		if (ans.length() == ab.length())
			ans = ans + "";
		else
			ans = "Invalid";
		System.out.println(ans);

	}

}
