package C06July19;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangePrintBiggestNumber {

	public static class Pair implements Comparable<Pair> {
		int no;
		String num;

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			int min = Math.min(this.num.length(), o.num.length());
			int a = Integer.parseInt(this.num.substring(0, min));
			int b = Integer.parseInt(o.num.substring(0, min));

			if (a != b)
				return b - a;
			else {
				int x = Integer.parseInt(this.num + o.num);
				int y = Integer.parseInt(o.num + this.no);
				return y - x;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		Pair[] arr = new Pair[soa];
		for (int i = 0; i < soa; i++) {
			Pair a = new Pair();
			a.no = sc.nextInt();
			a.num = a.no + "";
			arr[i] = a;
		}

		solve(arr);

		// doesnt work for this test case
		// 4
		// 54 543 548 60
		// ################################################################################
		// 6054854543

		// int max = arr[0].no;
		// int maxdid = nod(arr[0].no);
		//
		// for (int i = 1; i < soa; i++) {
		// int x = arr[i].no;
		// int cd = nod(x);
		// if (cd > maxdid)
		// maxdid = cd;
		// }
		//
		// for (int i = 0; i < soa; i++) {
		// int x = arr[i].no;
		// int cd = nod(x);
		// if (cd == maxdid)
		// arr[i].mul = 1;
		// else {
		// arr[i].mul = (int) Math.pow(10, maxdid - cd);
		// arr[i].no *= arr[i].mul;
		// }
		//
		// }
		// Arrays.sort(arr);
		// for (int i = 0; i < soa; i++) {
		//
		// System.out.print(arr[i].no/arr[i].mul+ "");
		// }
		//
		// }
		//
		// public static int nod(int no) {
		// int dig = 0;
		// while (no > 0) {
		// dig++;
		// no /= 10;
		// }
		// return dig;
		// }

	}

	public static void solve(Pair[] arr) {

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].no + "");
		}

	}
}
