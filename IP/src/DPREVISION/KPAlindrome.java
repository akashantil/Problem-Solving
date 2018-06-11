package DPREVISION;

import java.util.Scanner;

public class KPAlindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();

		for (int i = 0; i < not; i++) {
			int sos = sc.nextInt();
			int k = sc.nextInt();

			String ques = sc.next();

			if (checkPalindrome(ques)) {
				System.out.println(0);

			}

			int req = minDeletions(ques);
			System.out.println(req);
			if (req <= k) {
				System.out.println(true);

			} else
				System.out.println(false);
		}

	}

	public static boolean checkPalindrome(String ques) {

		int i = 0;
		int j = ques.length() - 1;

		while (i <= j) {
			char x = ques.charAt(i);
			char y = ques.charAt(j);
			if (x != y)
				return false;
			i++;
			j--;

		}
		return true;
	}

	public static int minDeletions(String ques) {
		if (checkPalindrome(ques))
			return 0;

		int ans = Integer.MAX_VALUE;

		int i = 0;
		int j = ques.length() - 1;

		while (i <= j) {

			char x = ques.charAt(i);
			char y = ques.charAt(j);

			if (x == y) {
				i++;
				j--;
			}

			else {

				int ra = Integer.MAX_VALUE;
				int rb = Integer.MAX_VALUE;
				String apf = ques.substring(0, i);
				String aaf = ques.substring(i + 1);
				i++;

				ra = 1 + minDeletions(apf + aaf);

				String bpf = ques.substring(0, j);
				String baf = ques.substring(j + 1);

				j--;
				rb = 1 + minDeletions(bpf + baf);

				ans = Math.min(ans, Math.min(ra, rb));

			}

		}

		return ans;
	}
}
