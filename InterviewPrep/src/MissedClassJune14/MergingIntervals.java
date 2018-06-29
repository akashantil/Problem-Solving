package MissedClassJune14;

import java.util.Arrays;
import java.util.Scanner;

public class MergingIntervals {
	public static class Pair implements Comparable<Pair> {
		int si;
		int ei;

		public Pair(int si, int ei) {
			this.si = si;
			this.ei = ei;
		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.si - o.si;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		Pair[] arr = new Pair[soa];

		for (int i = 0; i < soa; i++) {

			arr[i] = new Pair(sc.nextInt(), sc.nextInt());

		}
		Arrays.sort(arr);

		for (int i = 1; i < soa; i++) {
			if (arr[i].si <= arr[i - 1].ei) {
				arr[i].si = Math.min(arr[i].si, arr[i - 1].si);
				arr[i].ei = Math.max(arr[i].ei, arr[i - 1].ei);

				arr[i - 1].si = -1;
				arr[i - 1].ei = -1;
			}
		}
		for (int i = 0; i < soa; i++) {

			if (arr[i].si != -1) {
				System.out.println(arr[i].si + " " + arr[i].ei);
			}

		}

	}

}
