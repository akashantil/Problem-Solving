package Arrays;

import java.util.Scanner;

public class BringLessThanKTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		int k = sc.nextInt();

		int minCount = Integer.MIN_VALUE;

		int ws = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= k)
				ws++;

		}

		int countValid = 0;
		for (int j = 0; j < ws; j++) {
			if (arr[j] <= k)
				countValid++;

		}
		minCount = ws - countValid;
		for (int i = ws; i < arr.length; i++) {
			if (arr[i] <= k)
				countValid++;
			if (arr[i - ws] <= k)
				countValid--;

			if (ws - countValid < minCount)
				minCount = ws - countValid;

		}

		System.out.println(minCount);

	}

}
