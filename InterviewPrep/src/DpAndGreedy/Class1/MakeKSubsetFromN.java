package DpAndGreedy;

import java.util.Scanner;

public class MakeKSubsetFromN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] arr = new int[n + 1][k + 1];
		for (int i = 1; i <= n; i++) {
			arr[i][1] = 1;

		}
//		for (int i = 1; i <= k; i++) {
//			arr[1][i] = i;
//
//		}
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= k; j++) {
				

				arr[i][j] = arr[i - 1][j - 1] + j * arr[i - 1][j];

			}
		}
		System.out.println(arr[arr.length - 1][arr[0].length - 1]);

	}

}
