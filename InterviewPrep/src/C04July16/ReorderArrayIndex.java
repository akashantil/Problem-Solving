package C4July16;

import java.util.Scanner;

public class ReorderArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		int[] ind = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		for (int i = 0; i < soa; i++)
			ind[i] = sc.nextInt();

		for (int i = 0; i < soa; i++) {
			while (ind[i] != i) {
				int temp = arr[ind[i]];

				arr[ind[i]] = arr[i];

				arr[i] = temp;

				int tempind = ind[ind[i]];

				ind[ind[i]] = ind[i];
				ind[i] = tempind;
			}
		}
		for (int i = 0; i < soa; i++)
			System.out.print(arr[i] + " ");

	}

}
