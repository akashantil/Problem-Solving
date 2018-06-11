package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class TripletsWithSumLessThanTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] a = new int[soa];
		for (int i = 0; i < soa; i++) {
			a[i] = sc.nextInt();

		}
		int target = sc.nextInt();

		Arrays.sort(a);
		int i = 0;
		int j = 0;
		int k = a.length - 1;
		int ans = 0;

		while (i < a.length - 2) {
			j = i + 1;
			k = a.length - 1;
			while (j < k) {
				int sum = a[i] + a[j] + a[k];
				if (sum >= target) {
					k--;

				}

				else {
					ans += k - j;
					j++;

				}

			}
			i++;

		}
		System.out.println(ans);
	}
}
