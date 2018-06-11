package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ActivitySelectionProblem {

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

		int[] start = new int[soa];
		int[] end = new int[soa];
		for (int i = 0; i < soa; i++)
			start[i] = sc.nextInt();
		for (int i = 0; i < soa; i++)
			end[i] = sc.nextInt();

		pair[] arr = new pair[soa];
		for (int i = 0; i < soa; i++) {

			pair a = new pair(start[i], end[i]);
			arr[i] = a;
		}

		Arrays.sort(arr);

		ArrayList<Integer> res = new ArrayList<>();

		int[] len = new int[arr.length];
		int[] ends = new int[arr.length];

		len[0] = 1;
		res.add(0);
		ends[0] = arr[0].end;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].start >= ends[i - 1]) {
				ends[i] = arr[i].end;
				len[i] = len[i - 1] + 1;
				res.add(i);

			} else {
				ends[i] = ends[i - 1];
				len[i] = len[i - 1];

			}
		}

		for (int i = 0; i < res.size(); i++) {
			System.out.println(arr[res.get(i)].start + " " + arr[res.get(i)].end);
		}

	}

}
