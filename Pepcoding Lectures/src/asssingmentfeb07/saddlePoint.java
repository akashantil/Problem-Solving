package asssingmentfeb07;

import java.util.Scanner;

public class saddlePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row;
		int col;
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		int count = 0;
		int mior = 0;

		int maoc = 0;
		int flag = 0;
		int[] minr = new int[row];
		int[] maxc = new int[col];

		for (int i = 0; i < row; i++) {

			mior = arr[i][0];
			for (int j = 0; j < col; j++) {

				mior = Math.min(mior, arr[i][j]);

			}

			minr[i] = mior;

		}
		
while(count<col){
	maoc=0;
			
			for (int j = 0; j < row; j++) {

				maoc = Math.max(maoc, arr[j][count]);

			}

			maxc[count] = maoc;
			count++;

		}


		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (minr[i]==maxc[j]) {
					flag = 1;
					System.out.println(minr[i]);
				}
			}
		}
		if (flag == 0) {
			System.out.println("No Such Point Exist");
		}

	}

}
