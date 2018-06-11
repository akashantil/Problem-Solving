package Strings;

import java.util.Scanner;

public class LongestpalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String ques = sc.next();

		int ml = Integer.MIN_VALUE;

		int start = 0;
		int low = 0;
		int high = 0;

		for (int i = 0; i < ques.length(); i++) {

			// even length

			low = i - 1;
			high = i;

			while (low >= 0 && high < ques.length() && ques.charAt(low) == ques.charAt(high)) {

				if (high - low + 1 > ml) {
					ml = high - low + 1;
					start = low;

				}
				--low;
				++high;

			}

			// odd length;
			low = i - 1;
			high = i + 1;
			while (low >= 0 && high < ques.length() && ques.charAt(low) == ques.charAt(high)) {
				if (high - low + 1 > ml) {
					ml = high - low + 1;
					start = low;

				}
				--low;
				++high;

			}

		}
		System.out.println(ques.substring(start, start + ml));
		System.out.println(ml);

	}

}
