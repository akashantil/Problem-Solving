package C3July15;

import java.util.Scanner;

public class BringLessThanKTogetherInMinSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();

		int countinvalid = 0;
		int minswap = Integer.MAX_VALUE;

		for (int i = 0; i < k; i++)
			if (arr[i] > k)
				countinvalid++;

		minswap = countinvalid;
		for (int i = k; i < arr.length; i++) {
			if (arr[i - k] > k)
				countinvalid--;
			if (arr[i] > k)
				countinvalid++;

			if (countinvalid < minswap)
				minswap = countinvalid;
		}
		System.out.println(minswap);

	}

}
