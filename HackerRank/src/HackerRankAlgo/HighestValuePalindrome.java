package HackerRankAlgo;

import java.util.Scanner;

public class HighestValuePalindrome {
	// figure it out failing in some test cases
	public static void main(String[] args) {
		int sl;
		int no;
		String s;
		Scanner sc = new Scanner(System.in);
		sl = sc.nextInt();
		no = sc.nextInt();
		s = sc.next();
		char[] arr = new char[s.length()];
		arr = s.toCharArray();

		int noc = 0;
		int k = arr.length - 1;
		int mid = sl / 2;

		if (sl % 2 == 0) {
			int lp = mid - 1;
			int rp = mid;
			while (lp >= 0 && rp < sl) {
				if (arr[lp] != arr[rp])
					noc++;
				lp--;
				rp++;
			}

		} else {

			int lp = mid - 1;
			int rp = mid + 1;
			while (lp >= 0 && rp < sl) {
				if (arr[lp] != arr[rp])
					noc++;
				lp--;
				rp++;
			}

		}

		if (no >= s.length()) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = '9';
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			return;

		} else if (no / 2 == s.length() / 2) {
			int middle = s.length() / 2;
			for (int i = 0; i < arr.length; i++) {
				if (i != middle) {
					arr[i] = '9';
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);

			}
			return;

		} else if (noc > no) {
			System.out.println(-1);
		} else if (no > noc) {

			if (sl % 2 == 0) {
				int lp = mid - 1;
				int rp = mid;
				while (lp >= 0 && rp < sl) {
					if (arr[lp] != arr[rp])
						if (arr[lp] > arr[rp]) {
							arr[rp] = arr[lp];

						} else if (arr[rp] > arr[lp]) {
							arr[lp] = arr[rp];

						}
					lp--;
					rp++;
				}

			} else if (noc == no) {
				
				if (sl % 2 == 0) {
					int lp = mid - 1;
					int rp = mid;
					while (lp >= 0 && rp < sl) {
						if (arr[lp] != arr[rp])
							noc++;
						lp--;
						rp++;
					}

				} else {

					int lp = mid - 1;
					int rp = mid + 1;
					while (lp >= 0 && rp < sl) {
						if (arr[lp] != arr[rp])
							noc++;
						lp--;
						rp++;
					}

				}


				

			} else {
			

			int lp = mid - 1;
			int rp = mid + 1;
			while (lp >= 0 && rp < sl) {
				if (arr[lp] != arr[rp])
					if (arr[lp] > arr[rp]) {
						arr[rp] = arr[lp];

					} else if (arr[rp] > arr[lp]) {
						arr[lp] = arr[rp];

					}

				lp--;
				rp++;
			}

		}

	}

	int reso = no - noc;
	int i = 0;
	int j=arr.length-1;

	if(sl%2==1&&reso%2==1)
	{
		int m = sl / 2;
		if (arr[m] != '9') {
			arr[m] = '9';
			reso--;
		}

	}while(i<j)
	{
		if (arr[i] != '9' && arr[j] != '9') {
			arr[i] = '9';
			arr[j] = '9';
			reso -= 2;

		} else if (arr[i] == '9' && arr[j] == '9') {

		} else if (arr[i] == '9' || arr[j] == '9') {
			arr[i] = '9';
			arr[j] = '9';
			reso -= 1;

		}
		i++;
		j--;

	}

	for(
	int i1 = 0;i1<arr.length;i1++)
	{
		System.out.print(arr[i1]);
	}

}}
