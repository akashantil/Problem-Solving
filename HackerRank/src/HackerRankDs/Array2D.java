package HackerRankDs;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[6][6];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		HourGlass(arr);
	}

	public static void HourGlass(int[][] arr) {
		int sum = 0;
		int maxsum = Integer.MIN_VALUE;
		int count = 15;
		int row = 0, col = 0;

		while (count >= 0) {
			sum = 0;
			if(row!=4 &&col!=4){
			
				for (int i = row; i < row + 3 && i <= 5; i++) {
					for (int j = col; j < col + 3 && j <= 5; j++) {
						if (i == row + 1) {
							if (row + 1 < 6 && col + 1 < 6) {
								sum = sum + arr[row + 1][col + 1];
								break;
							}
						} else {
							sum = sum + arr[i][j];

						}
					}

				}

				count--;
				if (sum > maxsum) {
					maxsum = sum;
				}

				if (col < 5) {
					col++;

				} else {
					row++;
					col = 0;
				}
			}
			else{
				row++;
				col=0;
			}
			
				
			
		}
		System.out.println(maxsum);

	}

}
