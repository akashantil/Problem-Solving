package GeeksArraysArrangements;

import java.util.Scanner;

public class alternateMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using o(n)extra space
		int n;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] temp = new int[n];
		int i = 0;
		int j = arr.length - 1;
		int in = 0;
		while (i <= j) {
			if (in < n) {
				temp[in] = arr[j];

				in++;
			}
			if (in < n) {
				temp[in] = arr[i];
				in++;
			}
			i++;
			j--;

		}
		for (int k = 0; k < n; k++) {
			System.out.print(temp[k] + " ");
		}

	}

}
