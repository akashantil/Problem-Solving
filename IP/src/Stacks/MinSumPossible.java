package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MinSumPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Scanner sc = new Scanner(System.in);

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		Stack<Integer> s1 = new Stack<>();
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
			s1.push(arr[i]);
			sum1 += arr[i];
		}

		int soa2 = sc.nextInt();
		int[] arr2 = new int[soa2];

		Stack<Integer> s2 = new Stack<>();
		for (int i = 0; i < soa2; i++) {
			arr2[i] = sc.nextInt();
			s2.push(arr2[i]);
			sum2 += arr2[i];
		}
		int soa3 = sc.nextInt();
		int[] arr3 = new int[soa3];

		Stack<Integer> s3 = new Stack<>();
		for (int i = 0; i < soa3; i++) {
			arr3[i] = sc.nextInt();
			s3.push(arr3[i]);
			sum3 += arr3[i];
		}

		while (sum1 != sum2 && sum1 != sum3) {

			if (sum1 > sum2 && sum1 > sum3) {
				int x = s1.pop();
				sum1 -= x;
			} else if (sum1 < sum2 && sum2 > sum3) {
				int x = s2.pop();
				sum2 -= x;
			} else if (sum1 < sum3 && sum2 < sum3) {
				int x = s3.pop();
				sum3 -= x;
			}

		}
		System.out.println(sum1);

	}

}
