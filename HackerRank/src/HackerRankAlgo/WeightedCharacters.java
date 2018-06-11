package HackerRankAlgo;

import java.util.Scanner;

public class WeightedCharacters {

	public static void main(String[] args) {
		String s;
		int n;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		n = sc.nextInt();
		long[] arr = new long[27];
		for (int j = 0; j < s.length(); j++) {
			char x = s.charAt(j);
			arr[x - 'a' + 1]++;

		}
		
		
		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			flag = 0;

			// for(i=0;i<arr.length;i++){
			// System.out.print(arr[i]+" ");
			// }
			long sum = 0;
			for (int k = 1; k < arr.length; k++) {
				if (arr[k] > 0) {
					for (int p = 1; p <= arr[k]; p++) {

						sum = (k) * p;
						if (sum == q) {
							flag = 1;

						}
					}
				}
			}
			if (flag == 1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
	}

}
