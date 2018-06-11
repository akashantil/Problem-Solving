package OrderAndStats;

import java.util.Scanner;

public class FindTheMostRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		// x denotes the range of nos 0 -->k-1
		int x = sc.nextInt();
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			int idx = arr[i] % x;

			arr[idx] += x;

		}
		int msf = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > msf) {
				msf = arr[i];
			}
		}
		System.out.println(msf % x);

	}

}
