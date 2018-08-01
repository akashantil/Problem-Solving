package DpAndGreedy.class3;

import java.util.Scanner;

public class BuySellStockAtmostKtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int soa = sc.nextInt();
		int[] rate = new int[soa];

		for (int i = 0; i < soa; i++)
			rate[i] = sc.nextInt();

		int[][] res = new int[times+1][soa];

		for (int i = 1; i <=times; i++) {
			int maxDiff = -rate[0];
			for (int j = 1; j < soa; j++) {
				
				res[i][j]=Math.max(res[i][j-1], maxDiff+rate[j]);
				
				maxDiff=Math.max(res[i-1][j]-rate[j],maxDiff);

			}
		}
		System.out.println(res[times][soa-1]);

	}

}
