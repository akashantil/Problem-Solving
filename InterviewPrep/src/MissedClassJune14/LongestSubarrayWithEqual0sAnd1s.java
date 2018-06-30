package MissedClassJune14;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithEqual0sAnd1s {

	public static class Pair {
		int si;
		int ei;

		public Pair(int si, int ei) {
			this.si = si;
			this.ei = ei;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int sum = 0;
		boolean fz = false;
		boolean fo = false;

		for (int i = 0; i < soa; i++) {
			if (arr[i] == 0)
				fz = true;
			if (arr[i] == 1)
				fo = true;
		}
		if (fz == false || fo == false) {
			System.out.println("Not Found");
			return;
		}

		for (int i = 0; i < soa; i++) {
			arr[i] = arr[i] == 0 ? -1 : 1;

		}
		for (int i = 0; i < soa; i++) {
			sum += arr[i];
		}
		if (sum == 0) {
			for (int i = 0; i < soa; i++) {
				System.out.print((arr[i] = arr[i] == -1 ? 0 : 1) + " ");

			}
			return;

		}
		sum = 0;
		int maxlen = 0;
		int osi = 0;
		int oei = 0;
		HashMap<Integer, Pair> map = new HashMap<>();
		for (int i = 0; i < soa; i++) {
			sum += arr[i];
			map.put(sum, map.containsKey(sum) ? new Pair(map.get(sum).si, i) : new Pair(i, i));

			Pair temp = map.get(sum);
			if (temp.ei - temp.si >= maxlen) {
				maxlen = temp.ei - temp.si;
				osi = temp.si;
				oei = temp.ei;
			}

		}
		for (int i = osi + 1; i <= oei; i++)
			System.out.print((arr[i] = arr[i] == -1 ? 0 : 1) + " ");

	}

}
