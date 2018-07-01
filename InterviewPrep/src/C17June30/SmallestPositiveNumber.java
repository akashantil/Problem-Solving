package C16June30;

import java.util.Scanner;

public class SmallestPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int i = 0;
		int j = 0;
		while (j < soa) {
			if (arr[j] >= 0) {
				j++;
			} else {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
				i++;
			}
		}

		// at this point i denoted no of -ve elements in array;

		for (int k = 0; k < soa; k++) {
			arr[k] = Math.abs(arr[k]);
		}

		for (int l = i; l < soa; l++) {
			int idx = Math.abs(arr[l]);
			if (idx - 1 > -1 && idx - 1 < soa && arr[idx - 1] >= 0) {
				arr[idx - 1] *= -1;
			}
		}

		for (int a = 0; a < soa; a++) {
			if (arr[a] > 0) {
				System.out.println(a + 1);
				break;
			}
		}

	}

}
