package asssingmentfeb07;

import java.util.Scanner;

public class IsInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();

		}

		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();

		}
		isInverse(arr1,arr2);

	}

	public static void isInverse(int[] arr1, int[] arr2) {
		int flag = 0;
		for (int i = 0; i < arr1.length; i++) {
			int temp = arr1[i];
			if (arr2[temp] == i) {
				flag = 1;
			} else {
				System.out.println(false);
				return;

			}

		}
		if(flag==1){
			System.out.println(true);
		}
	}

}
