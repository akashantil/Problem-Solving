package asssingmentfeb07;

import java.util.Arrays;
import java.util.Scanner;

public class targetSumTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr1 = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();

		}
		int x;
		x = sc.nextInt();
		Arrays.sort(arr1);
		TargetSumTriplet(arr1, x);

	}

	public static void TargetSumTriplet(int[] arr1, int x) {
		int f = 0;
		int s = f + 1;
		int t = arr1.length - 1;

		while (f < t && f < arr1.length && s < arr1.length && t < arr1.length) {
			if ((arr1[f] + arr1[s] + arr1[t]) > x) {
				t--;

			}
			if (s == t) {
				f++;
				s = f + 1;
				t = arr1.length - 1;
			}

			else if ((arr1[f] + arr1[s] + arr1[t]) < x) {
				s++;
			}

			if (s == t) {
				f++;
				s = f + 1;
				t = arr1.length - 1;
			}

			else if ((arr1[f] + arr1[s] + arr1[t]) == x) {
				System.out.println(arr1[f] + ", " + arr1[s] + " and " + arr1[t]);
				s++;

			}
			if (s ==t) {
				f++;
				s = f + 1;
				t = arr1.length - 1;
			}

		}

	}

}
