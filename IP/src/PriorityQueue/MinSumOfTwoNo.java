package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinSumOfTwoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		PriorityQueue<Integer> min = new PriorityQueue<>();

		for (int i = 0; i < soa; i++)
			min.add(arr[i]);

		String num1 = "";
		String num2 = "";

		while (!min.isEmpty()) {
			int a = min.remove();
			int b = min.remove();
			num1 += a;
			num2 += b;

		}
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		System.out.println(n1 + n2);

	}

}
