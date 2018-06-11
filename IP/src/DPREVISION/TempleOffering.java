package DPREVISION;

import java.util.Scanner;

public class TempleOffering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not=sc.nextInt();
		for(int k=0;k<not;k++){
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		int[] left = new int[soa];
		int[] right = new int[soa];

		left[0] = 1;
		right[soa - 1] = 1;

		for (int i = 1; i < soa; i++) {
			if (arr[i] > arr[i - 1])
				left[i] = 1 + left[i - 1];
			else
				left[i] = 1;
		}
		for (int i = soa - 2; i >= 0; i--) {

			if (arr[i] > arr[i + 1])
				right[i] = 1 + right[i + 1];

			else
				right[i] = 1;

		}
		int ans = 0;
		for (int i = 0; i < soa; i++)
			ans += Math.max(left[i], right[i]);
		
		System.out.println(ans);

	}
	}

}
