package GeeksArraysArrangements;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		reverse(arr, 0, arr.length-1);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}

		

	}

	public static void reverse(int[] arr, int s, int e) {

		while (s <= e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}

	}

}
