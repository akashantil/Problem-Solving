package DPREVISION;

public class MAxSumAlternatingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 8, 2, 5, 6, 8 };

		int[] sum = new int[arr.length];
		String[] subseq = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			sum[i] = arr[i];
			subseq[i] = arr[i] + "";

		}
		sum[0] = arr[0];
		subseq[0] = arr[0] + "";

		for (int i = 1; i < arr.length; i++) {

			for (int j = i - 1; j >= 0; j--) {

				if (subseq[j].length() % 2 == 0) {
					// means we are looking for increasing subsequence

					if (arr[j] < arr[i]) {
						if (sum[i] < arr[i] + sum[j]) {
							sum[i] = arr[i] + sum[j];
							subseq[i] = subseq[j] + arr[i];

						}

					} else {

					}

				} else if (subseq[j].length() % 2 == 1) {
					// means we are looking for decreasing subsequence

					if (arr[j] > arr[i]) {

						if (sum[i] < arr[i] + sum[j]) {
							sum[i] = arr[i] + sum[j];
							subseq[i] = subseq[j] + arr[i];

						}

					}

				}

			}

		}
		int ms = Integer.MIN_VALUE;
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			if (sum[i] > ms) {
				ms = sum[i];
				ans = subseq[i];

			}
		}
		System.out.println(ms + "    " + ans);
	}
}
