package LRJuly18;

import java.util.Arrays;
import java.util.Scanner;

public class NoMinNoMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int soa = sc.nextInt();
			int k = sc.nextInt();

			int[] arr = new int[soa];
			for (int j = 0; j < soa; j++)
				arr[j] = sc.nextInt();

			Arrays.sort(arr);
		}

	}

}
