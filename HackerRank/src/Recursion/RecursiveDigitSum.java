package Recursion;

import java.util.Scanner;

public class RecursiveDigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int k = sc.nextInt();

		long sum = rsum(inp, 0);

		long no = sum * k;
		String recinp = no + "";
		int fsum = super_digit(recinp, 0);
		System.out.println(fsum);

	}

	public static long rsum(String inp, long sum) {
		if (inp.length() == 0) {
			return sum;
		}

		char x = inp.charAt(0);
		String roq = inp.substring(1);
		sum += x - '0';

		long recsum = rsum(roq, sum);
		return recsum;

	}

	public static int super_digit(String inp, int sum) {
		int ssum = 0;
		if (inp.length() == 0) {
			if (sum / 10 == 0) {
				return sum;
			} else {
				ssum = super_digit(sum + "", 0);

			}
			return ssum;

		}

		char x = inp.charAt(0);
		String roq = inp.substring(1);
		sum += x - '0';

		ssum = super_digit(roq, sum);
		return ssum;

	}
}