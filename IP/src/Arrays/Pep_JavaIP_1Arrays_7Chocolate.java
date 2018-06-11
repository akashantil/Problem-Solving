package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pep_JavaIP_1Arrays_7Chocolate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int st=sc.nextInt();

		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int i = 0;
		int j = i + st - 1;
		int mindiff = Integer.MAX_VALUE;
		while (j < arr.length) {
			int cdiff = arr[j] - arr[i];
			if (cdiff < mindiff) {
				mindiff = cdiff;
			}
			i++;
			j++;
		}

		System.out.println(mindiff);

	}

}
