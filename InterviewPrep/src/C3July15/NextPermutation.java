package C3July15;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		char[] arr = inp.toCharArray();

		int idx = -1;

		for (int i = arr.length - 1; i > 0; i--) {
			int cno = arr[i] - '0';
			int pno = arr[i - 1] - '0';
			if (cno > pno)
				idx = i;

		}
		if (idx != -1) {
			String bp = inp.substring(0, idx);
			String ap = inp.substring(idx);
			char bparr[] = bp.toCharArray();
			char aparr[] = ap.toCharArray();
			Arrays.sort(aparr);

			int notr = bparr[idx - 1] - '0';

			for (int i = 0; i < aparr.length; i++) {
				int notrw = aparr[i] - '0';

				if (notrw > notr) {
					char temp = bparr[idx - 1];

					bparr[idx - 1] = aparr[i];
					aparr[i] = temp;
				}
			}

			Arrays.sort(aparr);
			String ans = "";
			for (int i = 0; i < inp.length(); i++) {

				ans += (i < bparr.length) ? bparr[i] : aparr[i];

			}
			System.out.println(ans);

		} else {
			Arrays.sort(arr);
			String ans = "";
			for (int i = 0; i < inp.length(); i++) {
				ans += arr[i];
			}
			System.out.println(ans);
		}

	}

}
