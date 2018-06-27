package C4July16;

import java.util.Scanner;

public class CountSAsWithMaxInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int low = sc.nextInt();
		int high = sc.nextInt();
		int count = 0;
		int exc = 0;
		int inc = 0;

		for (int i = 0; i < soa; i++) {
			if (arr[i] < low) {
				inc++;
				exc++;
			} else if (arr[i] <= high) {
				inc++;
				count -= (exc * (exc + 1)) / 2;
				exc = 0;
			} else {
				count -= (exc * (exc + 1)) / 2;
				count += (inc * (inc + 1)) / 2;
				exc = 0;
				inc = 0;

			}

		}
		if (inc != 0 || exc != 0) {
			count -= (exc * (exc + 1)) / 2;
			count += (inc * (inc + 1)) / 2;

		}
		System.out.println(count);

	}
		

	}


