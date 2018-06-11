package Arrays;

import java.util.Scanner;

public class ReOrderAccToIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int[] index = new int[soa];
		for (int i = 0; i < soa; i++)
			index[i] = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {

			while (index[i] != i) {
				int temp = arr[i];
				arr[i] = arr[index[i]];
				arr[index[i]] = temp;

				temp = index[i];
				index[i] = index[index[i]];
				index[temp] = temp;

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
