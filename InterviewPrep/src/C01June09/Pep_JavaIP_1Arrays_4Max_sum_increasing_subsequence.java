package July9;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_4Max_sum_increasing_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int[] temp = new int[soa];

		temp[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			while (j >= 0) {
				if (arr[j] < arr[i])
					temp[i] = Math.max(arr[i],Math.max(temp[i], arr[i] + temp[j]));

				j--;
			}
		}

		int omax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (temp[i] > omax)
				omax = temp[i];

		}

		System.out.println(omax);
	}

}
