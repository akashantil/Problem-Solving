package asssingmentfeb07;

import java.util.Scanner;

public class FactandCombinatorics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		int r;
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		r = sc.nextInt();
		int fact = factorial(no);
		System.out.println(fact);
		int npr = npr(no, r);
		System.out.println(npr);
		int ncr = ncr(no, r);
		System.out.println(ncr);

	}

	public static int factorial(int no) {
		int fact = 1;
		for (int i = no; i > 0; i--) {
			fact *= i;

		}

		return fact;

	}

	public static int npr(int no, int r) {
		int upper = factorial(no);
		int lower = factorial(no - r);
		int nprr = upper / lower;
		return nprr;
	}

	public static int ncr(int no, int r) {
		int upper = factorial(no);
		int lower = factorial(no - r) * factorial(r);

		int ncrr = upper / lower;
		return ncrr;
	}
}
