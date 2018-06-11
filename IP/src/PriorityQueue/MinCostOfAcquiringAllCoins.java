package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinCostOfAcquiringAllCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		PriorityQueue<Integer> min = new PriorityQueue<>();
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
			min.add(arr[i]);
		}
		int k = sc.nextInt();
		int count = 0;

		while (soa > 0) {
			min.remove();
			soa = soa - (k + 1);
			count++;

		}
		System.out.println(count);

	}

}
