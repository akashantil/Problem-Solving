package DPREVISION;

import java.util.Scanner;

public class KPAlindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();

		for (int i = 0; i < not; i++) {
			int sos = sc.nextInt();
			int k = sc.nextInt();

			String ques = sc.next();

			int[][] arr = new int[ques.length()][ques.length()];
			Requiredk(ques, arr);
			if (k >= arr[0][ques.length() - 1])
				System.out.println(1);
			else
				System.out.println(0);
		}

	}

	public static boolean checkPalindrome(String ques) {

		int i = 0;
		int j = ques.length() - 1;

		while (i <= j) {
			char x = ques.charAt(i);
			char y = ques.charAt(j);
			if (x != y)
				return false;
			i++;
			j--;

		}
		return true;
	}

	public static int minDeletions(String ques) {
		if (checkPalindrome(ques))
			return 0;

		int ans = Integer.MAX_VALUE;

		int i = 0;
		int j = ques.length() - 1;

		while (i <= j) {

			char x = ques.charAt(i);
			char y = ques.charAt(j);

			if (x == y) {
				i++;
				j--;
			}

			else {

				int ra = Integer.MAX_VALUE;
				int rb = Integer.MAX_VALUE;
				String apf = ques.substring(0, i);
				String aaf = ques.substring(i + 1);
				i++;

				ra = 1 + minDeletions(apf + aaf);

				String bpf = ques.substring(0, j);
				String baf = ques.substring(j + 1);

				j--;
				rb = 1 + minDeletions(bpf + baf);

				ans = Math.min(ans, Math.min(ra, rb));

			}

		}

		return ans;
	}

	// better approach taking benefit of the fact min deletion can be atmost k
	// if can't make palindrome in k deletions return false;

	public static boolean isKPalindromic(String ques, int k) {

		if (k <= 0 && checkPalindrome(ques) == false)
			return false;
		if (k >= 0 && checkPalindrome(ques))
			return true;

		boolean id = false;
		boolean jd = false;

		int i = 0;
		int j = ques.length() - 1;
		while (i < j && k > 0) {

			char x = ques.charAt(i);
			char y = ques.charAt(j);
			if (x == y) {
				i++;
				j--;
			} else {
				// now we have 2 options either to delete char at i
				// or to delete char at j

				String bp = ques.substring(0, i);
				String ap = ques.substring(i + 1);
				String roq = bp + ap;

				id = isKPalindromic(roq, k - 1);
				if (id)
					return true;

				bp = ques.substring(0, j);
				ap = ques.substring(j + 1);
				roq = bp + ap;
				jd = isKPalindromic(roq, k - 1);
				if (jd)
					return true;

			}

		}

		return id || jd;

	}
	// even better approach instead of doing O(N) work in base case we do O(1)
	// by making
	// matrix of size O(N*N) i.e palindromic substrings

	public static void fillMatrix(String ques, int[][] arr) {

		for (int gap = 0; gap < ques.length() - 1; gap++) {
			for (int j = 0; j < ques.length(); j++) {
				if (j + gap < ques.length()) {
					if (j == j + gap)
						arr[j][j + gap] = 1;
					else {
						char x = ques.charAt(j);
						char y = ques.charAt(j + gap);
						if (gap == 1)
							if (x == y)
								arr[j][j + gap] = 1;
							else {
								if (x == y) {
									arr[j][j + gap] = arr[j + 1][j + gap - 1];
								}
							}

					}

				}
			}
		}

	}

	public static boolean isKPalindromicPossible(String ques, int si, int ei, int[][] arr, int k) {

		if (k <= 0 && arr[si][ei] == 0)
			return false;

		if (k >= 0 && arr[si][ei] == 1)
			return true;

		// if(qb[si][ei] >= k){
		// return true;
		// }

		boolean ir = false, jr = false;
		while (si < ei && k > 0) {

			char x = ques.charAt(si);
			char y = ques.charAt(ei);

			if (x == y) {
				si++;
				ei--;
			} else {

				ir = isKPalindromicPossible(ques, si + 1, ei, arr, k - 1);

				if (ir)
					return true;

				jr = isKPalindromicPossible(ques, si, ei - 1, arr, k - 1);
				if (jr)
					return true;

			}

		}

		return ir || jr;

	}

	
	
	
	//best approach we only need this matrix :)
	
	public static void Requiredk(String ques, int[][] reqK) {

		for (int gap = 0; gap < ques.length() ; gap++) {
			for (int j = 0; j < ques.length(); j++) {
				if (j + gap < ques.length()) {
					if (j == j + gap)
						reqK[j][j + gap] = 0;
					else {
						char x = ques.charAt(j);
						char y = ques.charAt(j + gap);
						if (gap == 1) {
							if (x == y)
								reqK[j][j + gap] = 0;
							else
								reqK[j][j + gap] = 1;

						}

						else {
							if (x == y) {
								reqK[j][j + gap] = reqK[j + 1][j + gap - 1];
							} else {
								reqK[j][j + gap] = 1+reqK[j][j + gap - 1];
							}
						}

					}

				}
			}
		}

	}

}