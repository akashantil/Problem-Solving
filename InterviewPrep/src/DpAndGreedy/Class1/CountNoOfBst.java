package DpAndGreedy.Class1;

import java.util.Scanner;

public class CountNoOfBst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		int[] arr = new int[soa];
		int[] freq = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
			freq[i] = sc.nextInt();
		}

		int[] prefix = new int[soa];
		prefix[0] = freq[0];
		for (int i = 1; i < soa; i++) {
			prefix[i] = prefix[i - 1] + freq[i];
		}

		int[][] cost = new int[soa][soa];

		for (int diag = 0; diag < soa; diag++) {

			int min = Integer.MAX_VALUE;

			for (int si = 0, ei = diag; ei < soa; ei++, si++) {

				if (si == ei) {
					cost[si][ei] = freq[si];

				} else if (ei - si == 1) {
					cost[si][ei] = Math.min(freq[si] + 2 * freq[ei], 2 * freq[si] + freq[ei]);
				} else {

					int totalsum = prefix[soa - 1];

					for (int cp = si; cp <= ei; cp++) {

						// making cuts(evry point as root) and taking left
						// subtree 0 to pei
						// and right subtree as pei+1 to soa-1;
						int pei = cp - 1;
						int psi = cp + 1;

						int f1 = pei < 0 ? 0 : cost[0][pei];
						int f2 = psi < soa ? cost[psi][soa - 1] : 0;

						min = Math.min(totalsum + f1 + f2, min);

					}
					cost[si][ei] = min;

				}

			}
		}
		System.out.println(cost[0][soa - 1]);

	}

}
