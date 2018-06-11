package GeeksArraysArrangements;

import java.util.Scanner;

public class MergeKSortedArrays {
//min heap will be used TODO
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noa;
		int soa;
		Scanner sc = new Scanner(System.in);
		noa = sc.nextInt();
		soa = sc.nextInt();
		int[][] arr = new int[noa][soa];

		for (int i = 0; i < noa; i++) {
			for (int j = 0; j < soa; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[] temp = new int[noa * soa];
		int i = 0;
		while (i < temp.length) {
         
		}

	}

}
