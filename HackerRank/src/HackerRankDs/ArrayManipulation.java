package HackerRankDs;

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		long max = Integer.MIN_VALUE;
		long[] arr = new long[n + 1];
		// for(int i=1;i<=n;i++){
		// arr[i]=sc.nextInt();
		//
		// }
		int c = 0;
		while (c < m) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();

			for (int i = a; i <= b; i++) {
				arr[i] += k;
			}
			c++;
		}
		for (int i = 1; i < n; i++) {
			max = Math.max(max, arr[i]);

		}
		max = Math.max(max, arr[n]);
		System.out.println(max);

	}

}
