package C2July12;

import java.util.Scanner;

public class StockBuySellInfiniteTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int k = 0; k < not; k++) {
			int soa = sc.nextInt();
			int[] arr = new int[soa];
			for (int i = 0; i < soa; i++)
				arr[i] = sc.nextInt();

			int cp = 0;
			// int op = 0;

			int buy = 0;
			int sell = 1;
			int prev = 0;

			// this one prints only profit not the pairs from which this answer
			// is
			// formed

			// while (sell < soa) {
			// cp = arr[sell] - arr[buy];
			//
			// if (cp > 0) {
			// op += cp;
			//
			// buy++;
			// sell++;
			// } else {
			// buy = sell;
			// sell++;
			// }
			//
			// }
			// System.out.println(op);

			while (sell < arr.length) {

				if (arr[sell] > arr[prev]) {
					prev = sell;
					sell++;
				} else {
					if (buy != prev)
						System.out.println(buy + " " + prev);
					cp += arr[prev] - arr[buy];
					buy = sell;
					prev = buy;
					sell++;
				}
			}

			if (arr[prev] > arr[buy]) {

				System.out.println(buy + " " + prev);

				cp += arr[prev] - arr[buy];
			}

			System.out.println(cp);

		}
	}

}
