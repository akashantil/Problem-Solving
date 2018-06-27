package MissedClassJune14;

import java.util.Scanner;

public class MaxsumIArrIForRotationsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		solve(arr);

		// this one puts larest element at last but it doesnt work alwasy
		// like for this test case
		// 8 3 4 9
		// ################################################################################
		// 46 should be output but it is giving 38.

		// int max = arr[0];
		// int mi = 0;
		// for (int i = 1; i < soa; i++) {
		// if (arr[i] > max) {
		// max = arr[i];
		// mi = i;
		// }
		// }
		// reverse(0, mi, arr);
		// reverse(mi + 1, arr.length - 1, arr);
		// reverse(0, arr.length - 1, arr);
		//
		// int maxSum=0;
		// for(int i=0;i<soa;i++)
		// maxSum+=i*arr[i];
		//
		// System.out.println(maxSum);
		//
		// }
		//
		// public static void reverse(int i, int j, int[] arr) {
		//
		// while (i < j) {
		// int temp = arr[i];
		// arr[i] = arr[j];
		// arr[j] = temp;
		// i++;
		// j--;
		// }
		// }

		// next_val = curr_val - (cum_sum - arr[i-1]) + arr[i-1] * (n-1);
		//
		// next_val = Value of &Sum;i*arr[i] after one rotation.
		// curr_val = Current value of &Sum;i*arr[i]
		// cum_sum = Sum of all array elements, i.e., &Sum;arr[i].
		//
		// Lets take example {1, 2, 3}. Current value is 1*0+2*1+3*2
		// = 8. Shifting it by one will make it {2, 3, 1} and next value
		// will be 8 - (6 - 1) + 1*2 = 5 which is same as 2*0 + 3*1 + 1*2

		// after one iteration we can calculate next rotation value;

	}

	public static void solve(int[] arr) {

		int currsum = 0;

		int sop = 0;

		for (int i = 0; i < arr.length; i++)
			currsum += arr[i];

		for (int i = 0; i < arr.length; i++)
			sop = sop + (i * arr[i]);
		int maxprod = sop;
		int nexProd = 0;

		for (int i = 1; i < arr.length; i++) {
			nexProd = sop - (currsum - arr[i - 1]) + arr[i - 1] * (arr.length - 1);
			if (nexProd > maxprod)
				maxprod = nexProd;

			sop = nexProd;

		}
		System.out.println(maxprod);

	}
}
