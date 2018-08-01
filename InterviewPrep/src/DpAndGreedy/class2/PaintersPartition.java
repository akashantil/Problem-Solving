package DpAndGreedy.class2;

import java.util.Scanner;

public class PaintersPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int k = sc.nextInt();

		int[][] dp = new int[k + 1][soa + 1];

		int[] prefixsum = new int[soa];
		prefixsum[0] = arr[0];

		for (int i = 1; i < prefixsum.length; i++) {
			prefixsum[i] = prefixsum[i - 1] + arr[i];

		}

		// if painter =1
		for (int i = 1; i < dp[0].length; i++) {
			dp[1][i] = prefixsum[i - 1];
		}

		// ifjob==1
		for (int i = 1; i < dp.length; i++) {
			dp[i][1] = arr[0];
		}

		for (int i = 2; i < dp.length; i++) {
			for (int j = 2; j < dp[0].length; j++) {

				if (j < i) {
					dp[i][j] = dp[i - 1][j];
				} else {

					int best = Integer.MAX_VALUE;

					for (int p = 1; p <= j; p++) {
//						int fact1=dp[i-1][p];
//						int fact2=prefixsum[j-1];
//						int fact3=prefixsum[p-1];
								
						best = Math.min(best, Math.max(dp[i-1][p],prefixsum[j-1]-prefixsum[p-1]));

					}
					dp[i][j] = best;

				}
			}
		}
		System.out.println(dp[k][soa]);

	}

}
