package DP;

import java.util.Scanner;

public class HighwayBillboardProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2 approaches O(M) Or O(N^2)
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[soa];
		int[] rev = new int[soa];

		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		for (int i = 0; i < soa; i++)
			rev[i] = sc.nextInt();
		
		int t=sc.nextInt();

		int[] temp = new int[soa];
		temp[0] = rev[0];

		for (int i = 1; i < temp.length; i++) {
			int msf = Integer.MIN_VALUE;
			for (int j = i; j >= 0; j--) {
				if (arr[i] - arr[j] > t) {
					msf = Math.max(msf,rev[i] + temp[j]);
				}

			}
			temp[i] = Math.max(temp[i-1], Math.max(msf, rev[i]));

		}
		System.out.println(temp[soa-1]);

	}

}
