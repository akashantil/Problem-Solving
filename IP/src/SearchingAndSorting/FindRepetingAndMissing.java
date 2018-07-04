package SearchingAndSorting;

import java.util.Scanner;

public class FindRepetingAndMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {
			int idx = Math.abs(arr[i]) - 1;
			if (arr[idx] > 0)
				arr[idx] *= -1;
			else {
				arr[idx] = 0;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				System.out.println("Element Repeated Twice = " + (i + 1));
			if (arr[i] > 0)
				System.out.println("Missing Element = " + (i + 1));

		}
	}
}
