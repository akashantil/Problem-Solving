package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_9Trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		int[] right = new int[soa];
		int[] left = new int[soa];

		left[0] = arr[0];
		int mil = arr[0];
		int vol = 0;
		for (int i = 1; i < left.length; i++) {
			if (arr[i] > mil) {
				mil = arr[i];
			}
			left[i] = mil;

		}
		int mir = arr[arr.length - 1];
		right[arr.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > mir) {
				mir = arr[i];
			}
			right[i] = mir;

		}
		int[] cost = new int[soa];
		for (int i = 0; i < cost.length; i++) {
			cost[i] = Math.min(left[i], right[i]) - arr[i];
		}

		for (int i = 0; i < cost.length; i++) {
			vol += cost[i];
		}
		
		System.out.println(vol);

	}

}
