package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class LongestChainPairProb {

	public static class pair implements Comparable<pair> {
		int start;
		int end;

		pair(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return this.end - o.end;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		pair[] arr = new pair[soa];
		for (int i = 0; i < soa; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			pair a = new pair(x, y);
			arr[i] = a;
		}

		Arrays.sort(arr);

		String[] res = new String[arr.length];
		int[] len = new int[arr.length];
		int[] ends = new int[arr.length];

		len[0] = 1;
		res[0] = arr[0].start + " -> " + arr[0].end + " . ";
		ends[0] = arr[0].end;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].start >= ends[i - 1]) {
				ends[i] = arr[i].end;
				len[i] = len[i - 1] + 1;
				res[i] = res[i - 1] + arr[i].start + " -> " + arr[i].end + " . ";

			} else {
				ends[i] = ends[i - 1];
				len[i] = len[i - 1];
				res[i] = res[i - 1];
			}
		}
		System.out.println(len[len.length - 1]);
		

	}

}
