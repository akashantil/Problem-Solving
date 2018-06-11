package HackerRankAlgo;

import java.util.Scanner;

public class beautifulBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String s;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < n - 1; i++) {
			char c = sb.charAt(i);
			if (c == '1' && i > 0 && i < s.length()) {
				if ((sb.charAt(i - 1) == '0') && (sb.charAt(i + 1) == '0'))
					
				{
					sb.setCharAt(i+1,'1');
					count++;
				}

			}

		}
		System.out.println(count);

	}

}
