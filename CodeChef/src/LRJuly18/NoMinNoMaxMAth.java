package LRJuly18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NoMinNoMaxMAth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int soa = sc.nextInt();
			int k = sc.nextInt();

			// PriorityQueue<Integer> pqmin = new PriorityQueue<>();
			// PriorityQueue<Integer> pqmax = new
			// PriorityQueue<>(Collections.reverseOrder());

			int[] arr = new int[soa];
			for (int j = 0; j < soa; j++) {
				// int x = sc.nextInt();
				// pqmax.add(x);
				// pqmin.add(x);
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);

			if (arr.length == k) {
				long ans = 1;
				for (int i1 = 1; i1 < arr.length - 1; i1++) {
					ans = (ans * arr[i1]) % 1000000007;

				}
				System.out.println(ans);

			} else {

				//
				// Syso
				System.out.println("MAths : " + solve3(arr, k));
				// System.out.println(solve3(arr, k));
			}

				System.out.print("BruteForce : ");
				bruteForce(arr, 0, new ArrayList<>(), k);
				System.out.println(resu);
				resu = 1;

			}
		
		//

	}

	public static long nck(int n, int k) {

		long num = 1;
		long deno = 1;
		if (k == 0)
			return 1;
		for (int i = 1; i <= k; i++) {
			num *= n;
			n--;
			deno *= i;

		}
		return num / deno;

	}

	public static long power(int base, int expo) {
		if (expo == 0)
			return base;
		if (expo == 1)
			return base;

		long res = power(base, expo / 2);

		if (expo % 2 == 0)
			return ((res * res) % 1000000007);
		else {
			return ((base) * ((res * res) % 1000000007) % 1000000007);
		}

	}

	public static long not(int n, int k) {
		long nos = nck(n, k);
		nos *= k;
		return nos / n;
	}

	public static long solve(int[] arr, int k) {

		PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

		long product = 1;

		int not = (int) not(arr.length, k);

		for (int i = 0; i < arr.length; i++) {
			min.add(arr[i]);
			max.add(arr[i]);

			long temp = (long) Math.pow(arr[i], not);

			product = (product * temp) % 1000000007;

		}

		int n = arr.length;

		for (int i = arr.length - k + 1; i > 0; i--) {

			int minele = min.remove();
			int maxele = max.remove();
			not = (int) not(n, k);

			long div1 = power(minele, not);
			long div2 = power(maxele, not);

			product = product / div1;
			product = product / div2;
			n--;

		}

		return product;

	}

	public static long solve2(PriorityQueue<Integer> pqmin, int k, PriorityQueue<Integer> pqmax) {

		long product = 1;
		int onot = (int) not(pqmin.size(), k);
		int osize = pqmin.size();
		int csize = osize;
		int loop = pqmin.size() - k;
		pqmin.remove();
		pqmax.remove();
		csize -= 2;

		for (int i = 0; i < loop && csize > 0; i++) {

			if (csize != 1) {

				int start = (int) not(pqmin.size(), k);
				int end = (int) not(osize - pqmin.size(), k - 1);
				int pow = onot - start - end;

				int currmin = pqmin.remove();
				int currmax = pqmax.remove();

				product = (product * power(currmin, pow)) % 1000000007;
				product = (product * power(currmax, pow)) % 1000000007;
			} else {

				// int start = (int) not(pqmin.size(), k);
				int start = (int) nck(pqmin.size() - 1, k - 1);
				int noOfMinEle = osize - pqmin.size();
				int end = (int) nck(noOfMinEle, k - 1);
				int pow = onot - start - end;

				int currmin = pqmin.remove();

				product = (product * power(currmin, pow)) % 1000000007;

			}

			csize -= 2;

		}

		return product;

	}

	public static int solve3(int[] arr, int k) {

		int product = 1;
		int n = arr.length;
		int st = 0;
		int en = arr.length - 1;
		int onot = (int) not(n, k);
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

				int pow = onot - start - end;
				int currmin = arr[st];
				int currmax = arr[en];
				st++;
				en--;

				product = (int) ((product * power(currmin, pow)) % 1000000007);
				product = (int) ((product * power(currmax, pow)) % 1000000007);
			} else {

				//
				int start = (int) nck((osize - st - 1), k - 1);
				int noOfMinEle = st;
				int end = (int) nck(noOfMinEle, k - 1);
				int pow = onot - start - end;

				int currmin = arr[st];
				st++;

				product = (int) ((product * power(currmin, pow)) % 1000000007);

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
