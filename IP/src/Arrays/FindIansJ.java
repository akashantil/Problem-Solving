package Arrays;

import java.util.Scanner;

public class FindIansJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find i and j such that arr[j]-arr[i] and j-i Is max
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		int dis = Integer.MIN_VALUE;

		int[] max = new int[arr.length];
		int[] min = new int[arr.length];

		max[arr.length - 1] = arr[arr.length - 1];
		min[0] = arr[0];

		for (int i = arr.length - 2; i >= 0; i--) {
			max[i] = Math.max(arr[i], max[i + 1]);

		}
		for (int i = 1; i < arr.length; i++) {
			min[i] = Math.min(arr[i], min[i - 1]);
		}
		int j = 0;
		int i = 0;

		while (j < arr.length && i < arr.length) {

			if (max[j] > min[i]) {
				if (j - i > dis)
					dis = j - i;
				j++;
			} else
				i++;

		}
		System.out.println(dis);
		

	}

}
