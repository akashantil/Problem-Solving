package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// O(1) sol (h(h+1))/2=n solve this quadratic equation;

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		Arrays.sort(arr);

		int noe = 1;
		int level = 0;

		for (int i = 0; i < arr.length; i += noe) {

			noe++;
			level++;

		}
		System.out.println(level);

	}

}
