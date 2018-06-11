package July9;

import java.util.Scanner;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		int sumofarr = 0;
		for (int i = 0; i < arr.length; i++)
			sumofarr += arr[i];

		int sumRHS = 0;
		int sumLHS = arr[0];
		int sumtillj=arr[0];
		for (int j = 1; j < arr.length; j++) {
			sumtillj += arr[j];
			sumRHS = sumofarr - sumLHS -arr[j] ;

			if (sumLHS  == sumRHS) {
				System.out.println(j);
				return;

			}
			sumLHS=sumtillj;
		}

		System.out.println(-1);
	}

}
