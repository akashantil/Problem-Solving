package temp;

import java.util.Arrays;
import java.util.Scanner;

public class QuadrupleResultingToTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();

		}
		int n = arr.length;
		int target = sc.nextInt();
		Pair[] farr = new Pair[(n * (n - 1)) / 2];

		for (int i = 0; i < farr.length; i++) {
			farr[i] = new Pair();
		}
		Arrays.sort(arr);
		int k = 0;
		int i = 0;
		int j = arr.length - 1;
		while (i < arr.length) {
			j = arr.length - 1;
			while (j > i) {
				int sum = arr[i] + arr[j];
				farr[k].sum = sum;
				farr[k].idx1 = i;
				farr[k].idx2 = j;
				j--;
				k++;
			}
			i++;

		}
		Arrays.sort(farr);

		int start = 0;
		int end = farr.length - 1;

		while (start < end) {
			if (farr[start].sum + farr[end].sum == target) {
				if (farr[start].idx1 != farr[end].idx1 && farr[start].idx1 != farr[end].idx2
						&& farr[start].idx2 != farr[end].idx1 && farr[start].idx2 != farr[end].idx2) {
					System.out.println(arr[farr[start].idx1] + " " + arr[farr[start].idx2] + " " + arr[farr[end].idx1]
							+ " " + arr[farr[end].idx2] + " = " + target);

				}
				end--;
			} else if (farr[start].sum + farr[end].sum > target)
				end--;
			else if (farr[start].sum + farr[end].sum < target)
				start++;
		}

	}

	public static class Pair implements Comparable<Pair> {
		int sum;
		int idx1;
		int idx2;

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.sum - o.sum;
		}

	}

}
