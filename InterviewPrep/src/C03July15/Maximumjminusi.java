package C03July15;

import java.util.Scanner;

public class Maximumjminusi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int[] temp = new int[soa];
		temp[soa - 1] = arr[soa - 1];
		for (int i = soa - 2; i >= 0; i--) {
			temp[i] = Math.max(temp[i + 1], arr[i]);
		}

		int i = 0;
		int j = 0;
		int maxDiff = -1;
		while (j < arr.length && i < arr.length) {
			if (arr[i] < temp[j]) {

				if (j - i > maxDiff)
					maxDiff = j - i;
				j++;
			} else {
				i++;
			}
		}
		System.out.println(maxDiff);

	}

}
