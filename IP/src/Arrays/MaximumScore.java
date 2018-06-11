package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		int[][] arr = new int[soa][soa];

		for (int i = 0; i < soa; i++) {
			for (int j = 0; j < soa; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < soa; i++)
			Arrays.sort(arr[i]);
		int maxsum = arr[soa - 1][soa - 1];

		for (int i = soa - 2; i >= 0; i--) {
			boolean foundinrow = false;
			for (int j = soa - 1; j >= 0; j--) {
				if (arr[i][j] < arr[soa - 1][soa - 1]) {
					maxsum += arr[i][j];
					foundinrow = true;
					break;
				}
			}
				if (foundinrow == false) {
					System.out.println("Invalid");
					return;
				}

			}

		
		System.out.println(maxsum);

	}

}
