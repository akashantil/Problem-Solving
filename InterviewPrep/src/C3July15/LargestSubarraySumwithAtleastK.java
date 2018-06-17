package C3July15;

import java.util.Scanner;

public class LargestSubarraySumwithAtleastK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();

		int osum = Integer.MIN_VALUE;
		int socw = 0;
		for (int i = 0; i < k; i++) {
			socw += arr[i];
			if (socw % k == 0)
				osum = socw;

		}
		for (int i = k; i < arr.length; i++) {
			socw = socw - arr[i - k] + arr[i];
			if (socw % k == 0)
				if (socw > osum)
					osum = socw;

		}
		System.out.println(osum);

	}

}
