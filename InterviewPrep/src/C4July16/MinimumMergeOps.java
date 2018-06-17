package C4July16;

import java.util.Scanner;

public class MinimumMergeOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int i = 0;
		int count = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] < arr[j]) {
				count++;
				arr[i + 1] += arr[i];
				i++;
			} else if (arr[j] < arr[i]) {
				count++;
				arr[j - 1] += arr[j];
				j--;
			} else if (arr[i] == arr[j]) {
				i++;
				j--;

			}
		}
		System.out.println(count);

	}

}
