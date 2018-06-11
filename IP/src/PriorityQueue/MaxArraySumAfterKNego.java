package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxArraySumAfterKNego {

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
		while (k > 0) {
			int x = min.remove();
			x *= -1;
			min.add(x);
			k--;
		}
		int sum = 0;
		while (!min.isEmpty()) {
			int x = min.remove();
			sum += x;

		}
		System.out.println(sum);

	}

}
