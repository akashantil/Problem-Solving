package July9;

import java.util.Scanner;

public class FirstSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		int k = sc.nextInt();
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		

		int st = 0;
		int en = 0;
		int sum = 0;
		boolean found = false;
		while (st < arr.length) {
			if (sum < k) {

				sum += arr[en];
				en++;
			} else if (sum > k) {
				sum -= arr[st];
				st++;

			}
			if (sum == k) {
				found = true;
				break;
			}
		}
		if (found == true)
			for (int i = st; i < en; i++)
				System.out.print(arr[i] + " ");
		else
			System.out.println("Not Found");

	}

}
