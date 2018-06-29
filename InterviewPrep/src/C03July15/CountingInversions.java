package C03July15;

import java.util.Scanner;

public class CountingInversions {

	public static class Pair {
		int[] arr;
		int ci;

		public Pair(int[] arr, int ci) {
			this.arr = arr;
			this.ci = ci;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int soa = sc.nextInt();
			int[] arr = new int[soa];
			if (soa == 0) {
				System.out.println(0);
				return;
			}
			for (int i1 = 0; i1 < soa; i1++)
				arr[i1] = sc.nextInt();

			if (arr.length == 1) {
				System.out.println(0);
				return;
			}

			Pair ans = MergeSort(arr, 0, arr.length - 1);

			System.out.println(ans.ci);
		}

	}

	public static Pair MergeSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] ba = new int[1];
			ba[0] = arr[lo];
			Pair a = new Pair(ba, 0);

			return a;

		}

		int mid = (lo + hi) / 2;
		Pair left = MergeSort(arr, lo, mid);
		Pair right = MergeSort(arr, mid + 1, hi);

		Pair res = Merging(left, right);
		return res;

	}

	public static Pair Merging(Pair left, Pair right) {
		int i = 0;
		int j = 0;
		int k = 0;
		int count = left.ci + right.ci;

		int[] one = left.arr;
		int[] two = right.arr;
		int[] result = new int[one.length + two.length];
		int mid = one.length;

		while (i < one.length && j < two.length) {

			if (one[i] <= two[j]) {
				result[k] = one[i];
				i++;
			} else {
				result[k] = two[j];
				count += mid - i;
				j++;
			}
			k++;
		}
		while (i < one.length) {
			result[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			result[k] = two[j];
			j++;
			k++;
		}

		Pair res = new Pair(result, count);

		return res;
	}

}
