package MissedClassJune14;

import java.util.Scanner;

public class LongestBitonicSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		boolean inc = false;
		int len = 1;
		int si = 0;
		int fsi = 0;
		int fl = 0;

		if (arr[0] < arr[1]) {
			inc = true;
			len = 2;
		} else {
			len = 2;
		}

		for (int i = 2; i < soa; i++) {
			if (inc == true && arr[i] > arr[i - 1])
				len++;
			else if (inc == true && arr[i] < arr[i - 1]) {
				inc = false;
				len++;
			} else if (inc == false && arr[i] < arr[i - 1]) {

				len++;
			} else if (inc == false && arr[i] > arr[i - 1]) {
				si = i-1;
				inc = true;
				len = 2;

			}
			if (len >= fl) {
				fl = len;
				fsi = si;
			}

		}
		for (int i = fsi; i < fsi + fl; i++)
			System.out.print(arr[i] + " ");

	}

}
