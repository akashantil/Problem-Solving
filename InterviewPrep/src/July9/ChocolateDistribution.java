package July9;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		int m = sc.nextInt();

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		int mindiff = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length-m; i += m) {
			int cdiff = arr[i + m-1] - arr[i];
			if (cdiff < mindiff)
				mindiff = cdiff;

		}
		System.out.println(mindiff);

	}

}
