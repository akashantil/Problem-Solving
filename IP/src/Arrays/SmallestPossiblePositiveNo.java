package Arrays;

import java.util.Scanner;

public class SmallestPossiblePositiveNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int sum = 1;

		if (arr[0] != 1) {
			System.out.println("1");
			return;
		} else {
			int i = 1;

			while (i < arr.length) {

				if (sum + 1 < arr[i]) {
					System.out.println(sum + 1);
					return;
				} else {
					sum+=arr[i];
					i++;
				}
			}
		}
		System.out.println(sum + 1);

	}

}
