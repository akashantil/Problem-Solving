package GeeksArraysArrangements;

import java.util.Scanner;

public class SortAlreadySorteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		
		int i = 0;
		int temp = 0;
		for (int j = i + 1; j < arr.length; j++) {
			i = j - 1;
			temp = arr[j];
			while (i >= 0) {

				if (temp > arr[i]) {

					arr[i + 1] = arr[i];
					i--;

				} else {
					break;
				}

			}

			arr[i + 1] = temp;
		}

		
		}

	}


