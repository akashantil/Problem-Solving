package C05July18;

import java.util.Arrays;
import java.util.Scanner;

public class MAxSumIn2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = row;
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = sc.nextInt();

		Arrays.sort(arr[row - 1]);

		int prmax = arr[row - 1][col - 1];
		int crmax = Integer.MIN_VALUE;
		int sum = prmax;
		boolean found = false;

		for (int i = row - 2; i >= 0; i--) {

			for (int j = 0; j < col; j++) {
				if (arr[i][j] < prmax) {
					found = true;
					if (arr[i][j] > crmax)
						crmax = arr[i][j];
				}

			}
			sum += crmax;
			prmax = crmax;
			crmax = Integer.MIN_VALUE;
			
			if (found == false) {
				System.out.println("Invalid");
				return;
			}
			found = false;

		}
		System.out.println(sum);

	}

}
