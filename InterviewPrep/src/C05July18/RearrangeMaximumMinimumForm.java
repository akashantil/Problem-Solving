package C05July18;

import java.util.Scanner;

public class RearrangeMaximumMinimumForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int max = arr[soa - 1] + 1;

		int i = 0;
		int j = soa - 1;
		for (int k = 0; k < soa; k++) {

			if (k % 2 == 0) {
				arr[k] = ((arr[j] % max) * max) + (arr[k] % max);
				j--;

			} else {
				arr[k] = (arr[i] % max) * max + (arr[k] % max);
				i++;

			}

		}
		for (int k = 0; k < soa; k++) {
			arr[k] = arr[k] / max;
			System.out.print(arr[k] + " ");
		}

	}

}
