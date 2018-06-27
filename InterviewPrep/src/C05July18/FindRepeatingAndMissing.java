package C05July18;

import java.util.Scanner;

public class FindRepeatingAndMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int xorres = 0;
		for (int x : arr) {
			xorres ^= x;
		}
		for (int i = 1; i <= soa; i++)
			xorres ^= i;

		int bm = xorres & ~(xorres - 1);

		int n1 = 0;
		int n2 = 0;

		for (int x : arr) {
			if ((x & bm) == 0)
				n1 = n1 ^ x;
			else
				n2 ^= x;

		}
		for (int i = 1; i <= soa; i++) {
			if ((i & bm) == 0) {
				n1 = n1 ^ i;

			} else
				n2 ^= i;
		}

		for (int i = 0; i < soa; i++) {
			if (arr[i] == n2) {
				System.out.println(n2 + " " + n1);
				return;
			}
		}

		System.out.println(n1 + " " + n2);

	}

}
