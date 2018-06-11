package DP;

import java.util.Scanner;

public class MaxAndMinWithAddMul {

	public static class pair {
		int max;
		int min;

		pair(int max, int min) {
			this.max = max;
			this.min = min;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String ques = sc.nextLine();
		

		pair ab = solve(ques);

		System.out.println(ab.max + " , " + ab.min);

	}

	public static pair solve(String ques) {
		if (ques.length() == 1) {
			pair ab = new pair(Integer.parseInt(ques), Integer.parseInt(ques));
			return ab;
		}
		pair res = new pair(Integer.MIN_VALUE, Integer.MAX_VALUE);
		for (int i = 0; i < ques.length(); i++) {
			char x = ques.charAt(i);

			if (x == '+' || x == '*') {

				pair left = solve(ques.substring(0, i));

				pair right = solve(ques.substring(i + 1));

				if (x == '+') {

					int no = left.max + right.max;
					if (no > res.max)
						res.max = no;
					int no1 = left.min + right.min;
					if (no1 < res.min)
						res.min = no1;

				} else if (x == '*') {

					int no = left.max * right.max;
					if (no > res.max)
						res.max = no;
					int no1 = left.min * right.min;
					if (no1 < res.min)
						res.min = no1;
				}
			}

		}
		return res;

	}

}
