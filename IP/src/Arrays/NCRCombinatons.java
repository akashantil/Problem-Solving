package Arrays;

import java.util.Scanner;

public class NCRCombinatons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int k = sc.nextInt();
		printncr(arr, k, "", 0, 0,-1);

	}

	public static void printncr(int[] arr, int k, String asf, int count, int idx,int lsi) {

		if (count == k) {
			System.out.println(asf);
			return;
		}
		if (idx >= arr.length)
			return;

		for (int i = lsi+1; i < arr.length; i++) {

			printncr(arr, k, asf + arr[i]+" ", count + 1, idx + 1,i);

		}

	}

}
