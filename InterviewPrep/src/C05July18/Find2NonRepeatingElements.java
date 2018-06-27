package C05July18;

import java.util.Scanner;

public class Find2NonRepeatingElements {

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

		int bm = xorres & ~(xorres - 1);

		int n1 = 0;
		int n2 = 0;

		for (int x : arr) {
			if ((x & bm) == 0)
				n1 = n1 ^ x;
			else
				n2 ^= x;

		}
		System.out.println(n2 + " " + n1);

	}

}
