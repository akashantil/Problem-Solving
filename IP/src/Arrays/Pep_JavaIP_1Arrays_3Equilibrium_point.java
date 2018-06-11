package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_3Equilibrium_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		// LONG TARGET = SC.NEXTLONG();

		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		long sumofarr = 0;
		for (int i = 0; i < arr.length; i++) {
			sumofarr += arr[i];

		}
		long sumtilli = 0;

		for (int i = 1; i < arr.length; i++) {
			sumtilli += arr[i - 1];

			if (sumtilli == (sumofarr - sumtilli - arr[i])) {
				System.out.println(i);
				return;
			}

		}
		System.out.println(-1);

	}

}
