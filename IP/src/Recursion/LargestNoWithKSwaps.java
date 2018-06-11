package Recursion;

import java.util.Scanner;

public class LargestNoWithKSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int k = sc.nextInt();

		max(inp, 0, k);
		System.out.println(max);

	}

	static int max = 0;

	public static void max(String no, int idx, int k) {

		int curr = Integer.parseInt(no);
		if (curr > max)
			max = curr;
		if (k == 0)
			return;
		if (idx >= no.length())
			return;

		for (int i = idx + 1; i < no.length(); i++) {

			char ch = no.charAt(idx);
			char rch = no.charAt(i);
			String before = no.substring(0, idx);
			String middle = no.substring(idx + 1, i);
			String after = no.substring(i + 1);

			String modified = before + rch + middle + ch + after;
			max(modified, idx + 1, k - 1);

		}

	}
}