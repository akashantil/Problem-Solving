package BitMAnipulation;

import java.util.Scanner;

public class DifferenceamongAllPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int ans = 0;
		for (int i = 0; i < 32; i++) {
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if ((arr[j] & (1 << i)) == 0)
					count++;
			}

				ans += (count * (arr.length - count) * 2);

			}
		System.out.println(ans);
		}
		

	

}
