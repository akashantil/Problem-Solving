package BitMAnipulation;

import java.util.Scanner;

public class BooleanArrayProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];

		for (int i = 0; i < 2; i++)
			arr[i] = sc.nextInt();

		arr[0] = arr[arr[0]];
		arr[1] = arr[0];

	}

}
