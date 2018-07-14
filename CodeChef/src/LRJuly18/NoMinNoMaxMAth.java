package LRJuly18;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class NoMinNoMaxMAth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(nck(100, 50));
//		Scanner sc = new Scanner(System.in);
//		int not = sc.nextInt();
//		for (int i = 0; i < not; i++) {
//			long MOD=1000000007;
//			int soa = sc.nextInt();
//			int k = sc.nextInt();
//
//			int[] arr = new int[soa];
//			for (int j = 0; j < soa; j++) {
//				arr[j] = sc.nextInt();
//			}
//			Arrays.sort(arr);
//
//			if (arr.length == k) {
//				int ans = 1;
//				for (int i1 = 1; i1 < arr.length - 1; i1++) {
//					ans = (int) ((ans * arr[i1]) % MOD);
//
//				}
//				System.out.println(ans);
//
//			} else {
//
//				 System.out.println("MAths : " + solve3(arr, k));
////				System.out.println(solve3(arr, k));
//			}
//
//			 System.out.print("BruteForce : ");
//			 bruteForce(arr, 0, new ArrayList<>(), k);
//			 System.out.println(resu);
//			 resu = 1;
//
//		}

	}

	public static long nck(int n, int k) {
		long MOD = 1000000007;

		long num = 1;
		long deno = 1;
		if (k == 0)
			return 1;
		for (int i = 1; i <= k; i++) {
			num = (num * n) % MOD;
			n--;
			deno = (deno * i) % MOD;

		}
		return num / deno;

	}

	public static int power(int base, long expo) {
		long MOD = 1000000007;
		if (expo == 0)
			return 1;

		int res = power(base, expo / 2);

		if (expo % 2 == 0) {
			int rv = (int) (((res % MOD) * (res % MOD)) % MOD);
			return rv;
		} else {
			int rv = (int) (((res % MOD) * (res % MOD)) % MOD);
			rv = (int) (((rv % MOD) * (base % MOD)) % MOD);
			return rv;
		}

	}

	public static long not(int n, int k) {
		long MOD = 1000000007;

		long nos = nck(n, k);
		long no = (nos * k) % MOD;
		return nos / n;
	}

	public static long solve3(int[] arr, int k) {
		long MOD = 1000000007;

		long product = 1;
		int n = arr.length;
		int st = 0;
		int en = arr.length - 1;
		long onot = not(n, k);
		int osize = n;
		int csize = osize;
		int loop = osize - k + 1;
		st++;
		en--;

		csize -= 2;

		for (int i = 0; i < loop && csize > 0 && st <= en; i++) {

			if (csize != 1) {

				int start = (int) nck((osize - st - 1), k - 1);
				int noOfMinEle = st;
				int end = (int) nck(noOfMinEle, k - 1);

				long pow = onot - start - end;
				int currmin = arr[st];
				int currmax = arr[en];
				st++;
				en--;
				long fact1 = power(currmin, pow);
				long fact2 = power(currmax, pow);

				product = (int) ((product * fact1) % MOD);
				product = (int) ((product * fact2) % MOD);
			} else {

				//
				int start = (int) nck((osize - st - 1), k - 1);
				int noOfMinEle = st;
				int end = (int) nck(noOfMinEle, k - 1);
				long pow = onot - start - end;

				int currmin = arr[st];
				st++;

				product = (int) ((product * power(currmin, pow)) % MOD);

			}

			csize -= 2;

		}

		return product;

	}

	static long resu = 1;

	public static void bruteForce(int[] arr, int idx, ArrayList<Integer> res, int k) {

		if (res.size() == k) {
			// System.out.println(res);

			for (int i = 1; i < res.size() - 1; i++) {
				int curr = res.get(i);
				resu = (resu * curr) % 1000000007;
			}

			return;

		}
		if (idx == arr.length) {
			return;
		}
		res.add(arr[idx]);
		bruteForce(arr, idx + 1, res, k);
		res.remove(res.size() - 1);
		bruteForce(arr, idx + 1, res, k);
	}

}
