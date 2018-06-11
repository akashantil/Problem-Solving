package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubArrayDivisibleByK {

	public static class pair {
		int si;
		int ei;
		int length;

		public pair(int si, int ei) {
			this.si = si;
			this.ei = ei;
			this.length = ei - si;
		}

		public void setend(int ei) {
			this.ei = ei;
			this.length = ei - si;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();

		HashMap<Integer, pair> map = new HashMap<>();
		int[] modsum = new int[arr.length];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			modsum[i] = sum % k;

		}

		map.put(0, new pair(-1, 0));
		for (int i = 0; i < arr.length; i++) {

			map.putIfAbsent(modsum[i], new pair(i, i));

			map.get(modsum[i]).setend(i);

		}
		int msf = 0;
		int si = 0;
		int ei = 0;
		for (Map.Entry<Integer, pair> res : map.entrySet()) {

			if (res.getValue().length > msf) {
				msf = res.getValue().length;
				si = res.getValue().si;
				ei = res.getValue().ei;
			}

		}
		for (int i = si + 1; i <= ei; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
