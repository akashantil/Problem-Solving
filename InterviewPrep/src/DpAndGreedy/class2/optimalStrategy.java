package DpAndGreedy.class2;

import java.util.Scanner;

public class optimalStrategy {

	public static class pair {
		int first;
		int second;

		public pair(int first, int second) {
	        this.first=first;
			this.second=second;
		}

		public String toString() {
			return first + "." + second;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		pair[][] res = new pair[soa][soa];

		for (int diag = 0; diag < soa; diag++) {

			for (int si = 0, ei = diag; ei < soa; ei++, si++) {

				if (si == ei) {

					pair temp = new pair(arr[si], 0);
					res[si][ei] = temp;
				}

				else if (ei - si == 1) {
					int max = Math.max(arr[si], arr[ei]);
					int min = Math.min(arr[si], arr[ei]);
					pair temp = new pair(max, min);
					res[si][ei] = temp;
				}

				else {
					int f1 = arr[ei] + res[si][ei - 1].second;
					int f2 = arr[si] + res[si + 1][ei].second;

					if (f1 > f2) {
						pair temp = new pair(f1, res[si][ei - 1].first);
						res[si][ei] = temp;

					} else {
						pair temp = new pair(f2, res[si + 1][ei].first);
						res[si][ei] = temp;

					}

				}

			}
		}
		System.out.println(res[0][soa - 1].first);

	}

}
