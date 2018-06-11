package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_2TarSub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		long target = sc.nextLong();

		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		long sum = arr[0];

		int i = 0;
		int j = 0;
		while (i < arr.length && j < arr.length) {

			if (sum < target) {
				i++;
				sum += arr[i];
				

			} else if (sum > target) {
				sum -= arr[j];
				j++;
			} else {
				for (int k = j; k <= i; k++) {
					System.out.print(arr[k] + " ");
				}
				return;
			}
		}
		System.out.println("Not found");
		

	}
}
