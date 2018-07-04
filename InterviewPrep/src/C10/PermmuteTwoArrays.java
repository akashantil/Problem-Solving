package C10;

import java.util.Arrays;
import java.util.Scanner;

public class PermmuteTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arra = new int[soa];
		int[] arrb = new int[soa];
		for (int i = 0; i < soa; i++)
			arra[i] = sc.nextInt();

		for (int i = 0; i < soa; i++)
			arrb[i] = sc.nextInt();

		int k = sc.nextInt();

		Arrays.sort(arra);
		Arrays.sort(arrb);

		int i = 0;
		int j = soa - 1;
		while (i < j) {
			int temp = arra[i];
			arra[i] = arra[j];
			arra[j] = temp;
			
			i++;
			j--;
		}

		for (int l = 0; l < soa; l++) {
			if (arra[l] + arrb[l] < k) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}

}
