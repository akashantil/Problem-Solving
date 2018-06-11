package GeeksArraysArrangements;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfConsecutiveDifferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int sum = 0;
		Arrays.sort(arr);
		// geeks approach
		// for(int i=0;i<n/2;i++){
		// sum-=(2*arr[i]);
		// sum+=(2*arr[n-i-1]);
		// }
		//

		// my approach but giving wrong answer for odd length
		int i = 0;
		int j = arr.length - 1;
		if (n % 2 == 0) {
			while (i <= j) {
				int diff1 = Math.abs(arr[i] - arr[j]);
				int diff2 = Math.abs(arr[i + 1] - arr[j]);
				sum = sum + diff1 + diff2;
				i++;
				j--;

			}
		} else if (n % 2 == 1) {
			while (i < j) {
				int diff1 = Math.abs(arr[i] - arr[j]);
				int diff2 = Math.abs(arr[i + 1] - arr[j]);
				sum = sum + diff1 + diff2;
				i++;
				j--;

			}
		}
		// as j would have been decreased while coming out of loop so
		// incrementing it
		if (n % 2 == 0) {
			++j;
		} else {
			j = j + 0;
		}
		int diff1 = Math.abs(arr[0] - arr[j]);
		sum += diff1;

		System.out.println(sum);

	}

}
