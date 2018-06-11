package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsack {

	public static class pair implements Comparable<pair> {

		int profit;
		int weight;
		int pbw;

		pair(int profit, int weight, int pbw) {

			this.profit = profit;
			this.weight = weight;
			this.pbw = pbw;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return o.pbw - this.pbw;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int soa = sc.nextInt();
		int cap = sc.nextInt();
		pair[] arr = new pair[soa];

		for (int i = 0; i < arr.length; i++) {

			int pro = sc.nextInt();
			int weight = sc.nextInt();

			pair a = new pair(pro, weight, pro / weight);
			arr[i] = a;
		}

		Arrays.sort(arr);

		double maxpro = 0;

		for (int i = 0; i < arr.length && cap > 0; i++) {

			if (arr[i].weight <= cap) {
				maxpro += arr[i].profit;
				cap -= arr[i].weight;
			} else {
				maxpro += (arr[i].profit * ((double) cap / arr[i].weight));
				break;
			}

		}
		System.out.println(maxpro);

	}

}
