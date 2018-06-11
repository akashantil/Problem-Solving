package asssingmentfeb07;

import java.util.Scanner;

public class MultiplicatioOfMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row;
		int col;
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		int[][] arr1 = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr1[i][j] = sc.nextInt();

			}
		}

		int[][] arr2 = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr2[i][j] = sc.nextInt();

			}
		}
		MoM(arr1, arr2);

	}

	public static void MoM(int[][] arr1, int[][] arr2) {
		int[][] pm = new int[arr1.length][arr2[0].length];

		
		
		int rmax = arr1.length;
		int cmax = arr2[0].length;
		
		
			
			for (int i = 0; i < rmax; i++) {
				
				for (int j = 0; j < cmax; j++) {
					
					int r=0;
					
					
					
					for(int s=0;s<cmax;s++){
						pm[i][j]=pm[i][j] + arr1[i][r] *arr2[r][j];
						r++;
						
						
						
					}
					
				}
				
			
		}
		Feb16.ArrayDisplay2d.Display(pm);

	}

}
