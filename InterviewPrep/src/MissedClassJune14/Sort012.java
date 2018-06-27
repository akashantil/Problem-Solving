package MissedClassJune14;

import java.util.Scanner;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		
		int i = 0;
		int j = 0;
		int k = soa - 1;

		while (j <= k) {
			if (arr[j] ==0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			} else if (arr[j] == 1) {
				j++;
			} else {
				int temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
				k--;
			}
		}
		for (int i1 = 0; i1 < soa; i1++)
			System.out.print(arr[i1] + " ");

	}

}
